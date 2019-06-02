package com.util;

/**
 * 分页数据
 * 
 */
public class PageDomain
{
    /** 当前记录起始索引 */
    private Integer pageNo;
    /** 每页显示记录数 */
    private Integer pageSize;
    /** 排序列 */
    private String sort;
    /** 排序的方向 "desc" 或者 "asc". */
    private String direction;

    public String getOrderBy()
    {
        if (StringUtils.isEmpty(sort))
        {
            return "";
        }
        return StringUtils.toUnderScoreCase(sort) + " " + direction;
    }

	public Integer getPageNo() {
		return pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

}
