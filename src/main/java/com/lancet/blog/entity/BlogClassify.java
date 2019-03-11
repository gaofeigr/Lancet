package com.lancet.blog.entity;


import com.lancet.person.entity.Person;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * @Description 博客分类bean
 * @Date 2019-2-18 22:49
 * @Author GaoFei
 * @Version 1.0
 **/
@Entity
@Table(name = "blog_classify")
public class BlogClassify {
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
    @Column(nullable = false)
    private String classifyName;
    /**
     * 创建时间
     */
    @Column(nullable = false)
    private Date createTime;
    /**
     * 最后修改时间
     */
    private Date lastModifyTime;
    /**
     * 上级分类Id
     */
    @ManyToOne(targetEntity = BlogClassify.class)
    @JoinColumn(name = "parent_classify_id")
    private BlogClassify parentClassify;
    /**
     * 创建者
     */
    @ManyToOne(targetEntity = Person.class)
    @JoinColumn(name = "create_person_id", nullable = false)
    private Person createPerson;

    /**
     * 子分类
     */
    @Transient
    private List<BlogClassify> childClassifys;

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

    public BlogClassify getParentClassify() {
        return parentClassify;
    }

    public void setParentClassify(BlogClassify parentClassify) {
        this.parentClassify = parentClassify;
    }

    public Person getCreatePerson() {
        return createPerson;
    }

    public void setCreatePerson(Person createPerson) {
        this.createPerson = createPerson;
    }

    public List<BlogClassify> getChildClassifys() {
        return childClassifys;
    }

    public void setChildClassifys(List<BlogClassify> childClassifys) {
        this.childClassifys = childClassifys;
    }
}
