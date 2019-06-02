package com.util;

/**
 * 表格数据处理
 * 
 * @author lizf
 */
public class TableSupport
{
    /**
     * 封装分页对象
     */
    public static PageDomain getPageDomain()
    {
        PageDomain pageDomain = new PageDomain();
        pageDomain.setPageNo(ServletUtils.getParameterToInt(Constants.PAGE_NO));
        pageDomain.setPageSize(ServletUtils.getParameterToInt(Constants.PAGE_SIZE));
        pageDomain.setSort(ServletUtils.getParameter(Constants.SORT));
        pageDomain.setDirection(ServletUtils.getParameter(Constants.DIRECTION));
        return pageDomain;
    }

    public static PageDomain buildPageRequest()
    {
        return getPageDomain();
    }
}
