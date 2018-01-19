package com.wooread.mybatisstudy;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.wooread.mybatisstudy.mapper.UserMapper;
import com.wooread.mybatisstudy.model.User;


/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(App.class.getResourceAsStream("/mybatis-config.xml")); 
        UserMapper userMapper = (UserMapper) factory.openSession().getMapper(UserMapper.class);
        User u = userMapper.selectById("123");
        System.out.println(u);
    }
}
