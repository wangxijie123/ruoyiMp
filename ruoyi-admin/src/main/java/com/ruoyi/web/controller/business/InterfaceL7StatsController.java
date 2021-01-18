package com.ruoyi.web.controller.business;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.quartz.service.IInterfaceL7StatsService;
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
@RequestMapping("/system/stats")
public class InterfaceL7StatsController extends BaseController {

    @Resource
    private IInterfaceL7StatsService service;


    @GetMapping("/")
    public AjaxResult insert(){
        service.insert();
        return AjaxResult.success();
    }

    @GetMapping("/list")
    public TableDataInfo getList(){
        return getDataTable(service.getList());
    }
}
