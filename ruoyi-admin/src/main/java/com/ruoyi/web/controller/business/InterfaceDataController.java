package com.ruoyi.web.controller.business;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.quartz.service.IInterfaceDataService;
import org.springframework.web.bind.annotation.GetMapping;
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
@RequestMapping("/system/data")
public class InterfaceDataController extends BaseController
{
    @Resource
    private IInterfaceDataService service;

    @GetMapping("/")
    public AjaxResult insert(){
        service.insert();
        return AjaxResult.success();
    }

    @GetMapping("/info")
    public AjaxResult getInfo(){
        return AjaxResult.success(service.getInfo());
    }
}
