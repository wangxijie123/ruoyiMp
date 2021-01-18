package com.ruoyi.web.controller.business;

import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.quartz.service.IInterfaceHostsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.core.controller.BaseController;

import javax.annotation.Resource;

/**
 * 【请填写功能名称】Controller
 * 
 * @author ruoyi
 * @date 2021-01-14
 */
@RestController
@RequestMapping("/system/hosts")
public class InterfaceHostsController extends BaseController
{
    @Resource
    private IInterfaceHostsService service;

    @GetMapping("/")
    public void get(){
        service.insert();
    }

    @GetMapping("/list")
    public TableDataInfo getList(){
        startPage();
        return getDataTable(service.selectAll());
    }

}
