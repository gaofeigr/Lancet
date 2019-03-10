package com.lancet.base.dao;

import java.util.List;


/**
 * @Description 分页对象
 * @Date 2019-3-10 18:09
 * @Author GaoFei
 * @Version 1.0
 **/
public class Page<T> {
    /**
     * 当前页数
     */
    private Integer pageNumber;
    /**
     * 每页显示数据行数
     */
    private Integer pageSize = 15;
    /**
     * 总页数
     */
    private Integer totalPage;
    /**
     * 总行数
     */
    private Integer total;
    /**
     * 数据集合
     */
    private List<T> rows;
    /**
     * 默认页
     */
    private static Page defaultPage;

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    public static Page getDefaultPage() {
        if (null == defaultPage) {
            defaultPage = new Page();
            defaultPage.setPageNumber(1);

        }
        return defaultPage;
    }

    public static Page getDefaultPage(int pageNumber) {
        if (null == defaultPage) {
            defaultPage = new Page();
            defaultPage.setPageNumber(pageNumber);
        }
        return defaultPage;
    }
}
