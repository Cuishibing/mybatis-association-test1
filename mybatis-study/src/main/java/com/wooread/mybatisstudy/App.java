package com.wooread.mybatisstudy;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.wooread.mybatisstudy.mapper.UserMapper;
import com.wooread.mybatisstudy.mapper.UserTaskMapper;
import com.wooread.mybatisstudy.model.User;
import com.wooread.mybatisstudy.model.TotalNumber;

/**
 * Hello world!
 *
 */
public class App {
    
    SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(App.class
            .getResourceAsStream("/mybatis-config.xml"));
    UserMapper userMapper = (UserMapper) factory.openSession().getMapper(
            UserMapper.class);
    UserTaskMapper userTaskMapper = (UserTaskMapper)factory.openSession().getMapper(UserTaskMapper.class);
    
    private void go() {
        TotalNumber t = new TotalNumber();
        List<User> users = userMapper.selectByUserName("cui", 0, 2, t);
        System.out.println(users.size() + " "+ t.getNum());
    }
    
    public static void main(String[] args) {
        new App().go();
    }
}
