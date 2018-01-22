package com.wooread.mybatisstudy.model;

import java.io.Serializable;

/**
 * 用户信息表对应的Model
 * */
public class UserInfo implements Serializable{
    
    private static final long serialVersionUID = 1L;

    /**
     * 用户信息id,主键
     * */
    private String userInfoId;
    
    /**
     * 用户性别
     * */
    private String sex;
    
    /**
     * 用户地址
     * */
    private String address;

    public String getUserInfoId() {
        return userInfoId;
    }

    public void setUserInfoId(String userInfoId) {
        this.userInfoId = userInfoId;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
}
