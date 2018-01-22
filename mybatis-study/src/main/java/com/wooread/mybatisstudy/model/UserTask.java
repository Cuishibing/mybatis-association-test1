package com.wooread.mybatisstudy.model;

import java.io.Serializable;

public class UserTask implements Serializable {

    private static final long serialVersionUID = 1L;
    
    /**
     * 用户id
     * */
    private String userId;
    
    /**
     * 用户任务
     * */
    private String taskName;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }
    
    @Override
    public String toString(){
        return "{"+ this.userId + " " + this.taskName + "}";
    }
    
}
