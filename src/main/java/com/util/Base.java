package com.util;

import java.util.List;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

public class Base{
	
	public String isOK(int num) {
		if(num >0) {
			return "suss";
		}else {
			return "fail";
		}
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public TableDataInfo getTable(List<?> list) {
		TableDataInfo table=new TableDataInfo();
		table.setCode(0);	
		table.setRows(list);
		table.setTotalRows(new PageInfo(list).getTotal());
		return table;
	}
	
	/**
     * 设置请求分页数据
     */
    protected void startPage()
    {
        PageDomain pageDomain = TableSupport.buildPageRequest();
        Integer pageNo = pageDomain.getPageNo();
        Integer pageSize = pageDomain.getPageSize();
        if (StringUtils.isNotNull(pageNo) && StringUtils.isNotNull(pageSize))
        {
            String orderBy = pageDomain.getOrderBy();
            PageHelper.startPage(pageNo, pageSize, orderBy);
        }
    }

}
