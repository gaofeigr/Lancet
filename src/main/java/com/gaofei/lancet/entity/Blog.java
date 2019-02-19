package com.gaofei.lancet.entity;

import java.util.Date;

/**
 * @Description 博客bean
 * @Date 2019-2-18 22:39
 * @Author GaoFei
 * @Version 1.0
 **/
public class Blog {
    /**
     * 主键id
     */
    private String id;
    /**
     * 正文
     */
    private StringBuffer text;
    /**
     * 创建者
     */
    private String userId;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 最后修改时间
     */
    private Date lastModifyTime;
    /**
     * 分类id
     */
    private String classifyId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public StringBuffer getText() {
        return text;
    }

    public void setText(StringBuffer text) {
        this.text = text;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public String getClassifyId() {
        return classifyId;
    }

    public void setClassifyId(String classifyId) {
        this.classifyId = classifyId;
    }
}
