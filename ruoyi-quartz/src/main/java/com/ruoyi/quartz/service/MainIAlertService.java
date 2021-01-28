package com.ruoyi.quartz.service;

import com.alibaba.fastjson.JSONObject;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2021-01-28
 */
public interface MainIAlertService
{

    void insertTest();

    void insert(JSONObject json, Long from, Long end);

    Long getMaxTime();
}
