package com.wooread.mybatisstudy.model;

import java.io.Serializable;
import java.util.List;

/**
 * User表的Model
 * */
public class User implements Serializable{
    
    private static final long serialVersionUID = 1L;

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
    
    /**
     * 用户任务列表
     * */
    private List<UserTask> userTasks;

    public List<UserTask> getUserTasks() {
        return userTasks;
    }

    public void setUserTasks(List<UserTask> userTasks) {
        this.userTasks = userTasks;
    }

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
