package com.util;

import java.io.Serializable;
import java.util.List;

/**
 * 表格分页数据对象
 * 
 */
public class TableDataInfo implements Serializable
{
    private static final long serialVersionUID = 1L;
    /** 总记录数 */
    private long totalRows;
    /** 列表数据 */
    private List<?> rows;
    /** 消息状态码 */
    private int code;

    /**
     * 表格数据对象
     */
    public TableDataInfo()
    {
    }

    /**
     * 分页
     * 
     * @param list 列表数据
     * @param total 总记录数
     */
    public TableDataInfo(List<?> list, int total)
    {
        this.rows = list;
        this.totalRows = total;
    }

    /**
	 * @return the totalRows
	 */
	public long getTotalRows() {
		return totalRows;
	}

	/**
	 * @param totalRows the totalRows to set
	 */
	public void setTotalRows(long totalRows) {
		this.totalRows = totalRows;
	}

	public List<?> getRows()
    {
        return rows;
    }

    public void setRows(List<?> rows)
    {
        this.rows = rows;
    }

    public int getCode()
    {
        return code;
    }

    public void setCode(int code)
    {
        this.code = code;
    }
}
