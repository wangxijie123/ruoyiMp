package com.ruoyi.quartz.mapper;

import com.ruoyi.common.core.domain.HostInfo;

import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2021-01-22
 */
public interface HostInfoMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public HostInfo selectHostInfoById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param hostInfo 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<HostInfo> selectHostInfoList(HostInfo hostInfo);

    /**
     * 新增【请填写功能名称】
     * 
     * @param hostInfo 【请填写功能名称】
     * @return 结果
     */
    public int insertHostInfo(HostInfo hostInfo);

    /**
     * 修改【请填写功能名称】
     * 
     * @param hostInfo 【请填写功能名称】
     * @return 结果
     */
    public int updateHostInfo(HostInfo hostInfo);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteHostInfoById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteHostInfoByIds(Long[] ids);

    HostInfo getInfoByIp(String ip);
}
