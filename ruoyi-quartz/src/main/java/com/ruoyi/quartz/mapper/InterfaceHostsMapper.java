package com.ruoyi.quartz.mapper;


import com.ruoyi.common.core.domain.InterfaceHosts;

import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2021-01-14
 */
public interface InterfaceHostsMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public InterfaceHosts selectInterfaceHostsById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param interfaceHosts 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<InterfaceHosts> selectInterfaceHostsList(InterfaceHosts interfaceHosts);

    /**
     * 新增【请填写功能名称】
     * 
     * @param interfaceHosts 【请填写功能名称】
     * @return 结果
     */
    public int insertInterfaceHosts(InterfaceHosts interfaceHosts);

    /**
     * 修改【请填写功能名称】
     * 
     * @param interfaceHosts 【请填写功能名称】
     * @return 结果
     */
    public int updateInterfaceHosts(InterfaceHosts interfaceHosts);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteInterfaceHostsById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteInterfaceHostsByIds(Long[] ids);

    void deleteAll();

}
