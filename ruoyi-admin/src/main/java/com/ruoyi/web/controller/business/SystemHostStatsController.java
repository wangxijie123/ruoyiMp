package com.ruoyi.web.controller.business;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.quartz.service.ISystemHostStatsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 【请填写功能名称】Controller
 * 
 * @author ruoyi
 * @date 2021-01-18
 */
@RestController
@RequestMapping("/system/stats")
public class SystemHostStatsController extends BaseController
{
    @Resource
    private ISystemHostStatsService service;


}
