package com.ruoyi.quartz.service.impl;

import com.ruoyi.quartz.mapper.SystemHostStatsMapper;
import com.ruoyi.quartz.service.ISystemHostStatsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-01-18
 */
@Service
@Transactional
public class SystemHostStatsServiceImpl implements ISystemHostStatsService
{
    @Resource
    private SystemHostStatsMapper mapper;


}
