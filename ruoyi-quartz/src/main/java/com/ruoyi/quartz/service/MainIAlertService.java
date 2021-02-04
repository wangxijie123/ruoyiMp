package com.ruoyi.quartz.service;

import com.alibaba.fastjson.JSONObject;
import com.ruoyi.common.core.domain.MainAlert;

import java.util.List;

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

    List<MainAlert> listAll();
}
