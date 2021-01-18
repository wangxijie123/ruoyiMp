package com.ruoyi.quartz.service;

import com.alibaba.fastjson.JSONObject;
import com.ruoyi.common.core.domain.HostApplication;

import java.util.List;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2021-01-15
 */
public interface IHostApplicationService 
{

    void insertTest();

    void insert(JSONObject json , String ip);

    List<HostApplication> getInfoByIp(String ip);
}
