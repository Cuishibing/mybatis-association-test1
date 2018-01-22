package com.wooread.mybatisstudy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wooread.mybatisstudy.model.UserTask;

public interface UserTaskMapper {
    
    /**
     * 获取某个user的任务
     * */
    List<UserTask> selectByUserId(@Param("userId")String userId);
    
}
