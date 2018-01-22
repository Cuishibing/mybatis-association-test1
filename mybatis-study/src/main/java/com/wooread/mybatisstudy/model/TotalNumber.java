package com.wooread.mybatisstudy.model;

import java.io.Serializable;

/**
 * 分页查询用户所对应的DTO
 * */
public class TotalNumber implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    /**
     * 总的用户数
     * */
    Integer num;
    
    public Integer getNum() {
        return num;
    }
    
    public void setNum(Integer num) {
        this.num = num;
    }
    
}
