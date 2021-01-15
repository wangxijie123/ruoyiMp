package com.ruoyi.quartz.service;

import com.ruoyi.common.core.domain.InterfaceHosts;

import java.util.List;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2021-01-14
 */
public interface IInterfaceHostsService 
{
    public void insert();

    List<String> selectAllIp();
}
