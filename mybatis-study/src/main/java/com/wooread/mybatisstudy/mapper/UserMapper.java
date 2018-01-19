package com.wooread.mybatisstudy.mapper;

import org.apache.ibatis.annotations.Param;

import com.wooread.mybatisstudy.model.User;

public interface UserMapper {
    
    User selectById(@Param("userId")String userId);
    
}
