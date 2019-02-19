package com.gaofei.lancet.entity;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;
import java.util.Date;

/**
 * @Description 博客bean
 * @Date 2019-2-18 22:39
 * @Author GaoFei
 * @Version 1.0
 **/
@Entity
@Table(name = "lancet_blog")
public class LancetBlog {
    /**
     * 主键id
     */
    @Id
    @GeneratedValue(generator = "gen", strategy = GenerationType.IDENTITY)
    @SequenceGenerator(name = "gen", sequenceName = "SEQ_CHECK_RESULT")
    @NotNull
    private int id;
    /**
     * 正文
     */
    private StringBuffer text;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 最后修改时间
     */
    private Date lastModifyTime;
    /**
     * 创建者
     */
    @ManyToOne(targetEntity = LancetUser.class)
    @JoinColumn(name = "create_user_id")
    private LancetUser createUser;
    /**
     * 分类
     */
    @ManyToOne(targetEntity = LancetBlogClassify.class)
    @JoinColumn(name = "classify")
    private LancetBlogClassify classify;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public StringBuffer getText() {
        return text;
    }

    public void setText(StringBuffer text) {
        this.text = text;
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

    public LancetUser getCreateUser() {
        return createUser;
    }

    public void setCreateUser(LancetUser createUser) {
        this.createUser = createUser;
    }

    public LancetBlogClassify getClassify() {
        return classify;
    }

    public void setClassify(LancetBlogClassify classify) {
        this.classify = classify;
    }
}
