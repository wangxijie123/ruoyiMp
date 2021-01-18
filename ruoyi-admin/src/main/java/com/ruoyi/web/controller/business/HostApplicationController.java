package com.ruoyi.web.controller.business;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.quartz.service.IHostApplicationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 【请填写功能名称】Controller
 * 
 * @author ruoyi
 * @date 2021-01-15
 */
@RestController
@RequestMapping("/system/application")
public class HostApplicationController extends BaseController
{
    @Resource
    private IHostApplicationService service;

    @GetMapping("/")
    public void insert(){
        service.insertTest();
    }

    @GetMapping("/infoByIp")
    public TableDataInfo getInfoByIp(String ip){
        return getDataTable(service.getInfoByIp(ip));
    }

}
