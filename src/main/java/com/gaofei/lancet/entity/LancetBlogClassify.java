package com.gaofei.lancet.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * @Description 博客分类bean
 * @Date 2019-2-18 22:49
 * @Author GaoFei
 * @Version 1.0
 **/
@Entity
@Table(name = "lancet_blog_classify")
public class LancetBlogClassify {
    /**
     * 主键id
     */
    @Id
    @GeneratedValue(generator = "gen", strategy = GenerationType.IDENTITY)
    @SequenceGenerator(name = "gen", sequenceName = "SEQ_CHECK_RESULT")
    private int id;
    /**
     * 分类名称
     */
    private String classifyName;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 最后修改时间
     */
    private Date lastModifyTime;
    /**
     * 上级分类Id
     */
    @ManyToOne(targetEntity = LancetBlogClassify.class)
    @JoinColumn(name = "parent_classify_id")
    private LancetBlogClassify parentClassify;
    /**
     * 创建者
     */
    @ManyToOne(targetEntity = LancetUser.class)
    @JoinColumn(name = "create_user_id")
    private LancetUser createUser;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClassifyName() {
        return classifyName;
    }

    public void setClassifyName(String classifyName) {
        this.classifyName = classifyName;
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

    public LancetBlogClassify getParentClassify() {
        return parentClassify;
    }

    public void setParentClassify(LancetBlogClassify parentClassify) {
        this.parentClassify = parentClassify;
    }

    public LancetUser getCreateUser() {
        return createUser;
    }

    public void setCreateUser(LancetUser createUser) {
        this.createUser = createUser;
    }
}
