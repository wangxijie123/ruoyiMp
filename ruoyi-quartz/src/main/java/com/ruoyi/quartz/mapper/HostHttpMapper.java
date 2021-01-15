package com.ruoyi.quartz.mapper;

import com.ruoyi.common.core.domain.HostHttp;

import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2021-01-15
 */
public interface HostHttpMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public HostHttp selectHostHttpById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param hostHttp 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<HostHttp> selectHostHttpList(HostHttp hostHttp);

    /**
     * 新增【请填写功能名称】
     * 
     * @param hostHttp 【请填写功能名称】
     * @return 结果
     */
    public int insertHostHttp(HostHttp hostHttp);

    /**
     * 修改【请填写功能名称】
     * 
     * @param hostHttp 【请填写功能名称】
     * @return 结果
     */
    public int updateHostHttp(HostHttp hostHttp);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteHostHttpById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteHostHttpByIds(Long[] ids);
}
