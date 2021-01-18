package com.ruoyi.quartz.mapper;

import com.ruoyi.common.core.domain.InterfaceData;

import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2021-01-18
 */
public interface InterfaceDataMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public InterfaceData selectInterfaceDataById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param interfaceData 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<InterfaceData> selectInterfaceDataList(InterfaceData interfaceData);

    /**
     * 新增【请填写功能名称】
     * 
     * @param interfaceData 【请填写功能名称】
     * @return 结果
     */
    public int insertInterfaceData(InterfaceData interfaceData);

    /**
     * 修改【请填写功能名称】
     * 
     * @param interfaceData 【请填写功能名称】
     * @return 结果
     */
    public int updateInterfaceData(InterfaceData interfaceData);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteInterfaceDataById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteInterfaceDataByIds(Long[] ids);

    InterfaceData getInfo();

}
