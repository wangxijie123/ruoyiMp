package com.ruoyi.common.core.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 flows
 * 
 * @author ruoyi
 * @date 2021-02-02
 */
public class Flow
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long hashId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String columnNdpi;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String columnDuration;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String columnInfo;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String columnKey;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String columnClient;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String columnProtoL4;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String keyAndHash;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String columnBreakdown;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String columnServer;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String keyKey;

    public void setHashId(Long hashId) 
    {
        this.hashId = hashId;
    }

    public Long getHashId() 
    {
        return hashId;
    }
    public void setColumnNdpi(String columnNdpi) 
    {
        this.columnNdpi = columnNdpi;
    }

    public String getColumnNdpi() 
    {
        return columnNdpi;
    }
    public void setColumnDuration(String columnDuration) 
    {
        this.columnDuration = columnDuration;
    }

    public String getColumnDuration() 
    {
        return columnDuration;
    }
    public void setColumnInfo(String columnInfo) 
    {
        this.columnInfo = columnInfo;
    }

    public String getColumnInfo() 
    {
        return columnInfo;
    }
    public void setColumnKey(String columnKey) 
    {
        this.columnKey = columnKey;
    }

    public String getColumnKey() 
    {
        return columnKey;
    }
    public void setColumnClient(String columnClient) 
    {
        this.columnClient = columnClient;
    }

    public String getColumnClient() 
    {
        return columnClient;
    }
    public void setColumnProtoL4(String columnProtoL4) 
    {
        this.columnProtoL4 = columnProtoL4;
    }

    public String getColumnProtoL4() 
    {
        return columnProtoL4;
    }
    public void setKeyAndHash(String keyAndHash) 
    {
        this.keyAndHash = keyAndHash;
    }

    public String getKeyAndHash() 
    {
        return keyAndHash;
    }
    public void setColumnBreakdown(String columnBreakdown) 
    {
        this.columnBreakdown = columnBreakdown;
    }

    public String getColumnBreakdown() 
    {
        return columnBreakdown;
    }
    public void setColumnServer(String columnServer) 
    {
        this.columnServer = columnServer;
    }

    public String getColumnServer() 
    {
        return columnServer;
    }
    public void setKey(String key) 
    {
        this.keyKey = key;
    }

    public String getKey() 
    {
        return keyKey;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("hashId", getHashId())
            .append("columnNdpi", getColumnNdpi())
            .append("columnDuration", getColumnDuration())
            .append("columnInfo", getColumnInfo())
            .append("columnKey", getColumnKey())
            .append("columnClient", getColumnClient())
            .append("columnProtoL4", getColumnProtoL4())
            .append("keyAndHash", getKeyAndHash())
            .append("columnBreakdown", getColumnBreakdown())
            .append("columnServer", getColumnServer())
            .append("key", getKey())
            .toString();
    }
}
