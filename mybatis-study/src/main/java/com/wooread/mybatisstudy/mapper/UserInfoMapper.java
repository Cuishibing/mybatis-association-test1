package com.wooread.mybatisstudy.mapper;

import org.apache.ibatis.annotations.Param;

import com.wooread.mybatisstudy.model.UserInfo;

public interface UserInfoMapper {
    
    UserInfo selectById(@Param("userInfoId")String userInfoId);
    
}
