package com.wooread.mybatisstudy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wooread.mybatisstudy.model.User;
import com.wooread.mybatisstudy.model.TotalNumber;

public interface UserMapper {
    
    /**
     * 根据id查询用户
     * */
    User selectById(@Param("userId") String userId);
    
    /**
     * 根据用户名查询用户
     * */
    List<User> selectByUserName(@Param("userName") String userName,
            @Param("offset") long offset, @Param("size") long size,
            @Param("totals") TotalNumber totals);
    
}
