package com.ruoyi.quartz.service;

import com.alibaba.fastjson.JSONObject;
import com.ruoyi.common.core.domain.HostInfo;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2021-01-22
 */
public interface IHostInfoService 
{

    void insertTest();

    HostInfo getInfoByIp(String ip);

    void insert(JSONObject json, String ip);
}
