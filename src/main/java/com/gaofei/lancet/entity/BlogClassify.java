package com.gaofei.lancet.entity;

import java.util.Date;

/**
 * @Description 博客分类
 * @Date 2019-2-18 22:49
 * @Author GaoFei
 * @Version 1.0
 **/
public class BlogClassify {
    /**
     * 主键id
     */
    private String id;
    /**
     * 分类名称
     */
    private String classifyName;
    /**
     * 上级分类Id
     */
    private String parentClassifyId;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 最后修改时间
     */
    private Date lastModifyTime;
}
