package com.wooread.mybatisstudy.model;

/**
 * User表的Model
 * */
public class User {
    
    /**
     * 用户id,主键
     * */
    private String userId;
    
    /**
     * 用户名
     * */
    private String userName;
    
    /**
     * 用户密码
     * */
    private String password;
    
    /**
     * 用户信息
     * */
    private UserInfo userInfo;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }
    
}
