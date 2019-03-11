package com.lancet.blog.entity;

import com.lancet.person.entity.Person;
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
@Table(name = "blog")
public class Blog {
    /**
     * 主键id
     */
    @Id
    @GeneratedValue(generator = "gen", strategy = GenerationType.IDENTITY)
    @SequenceGenerator(name = "gen", sequenceName = "SEQ_CHECK_RESULT")
    @NotNull
    private int id;
    /**
     * 标题
     */
    @Column(nullable = false)
    private String title;
    /**
     * 正文
     */
    @Lob
    @Basic(fetch = FetchType.EAGER)
    @Column(nullable = false)
    private String text;
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
     * 创建者
     */
    @ManyToOne(targetEntity = Person.class)
    @JoinColumn(name = "create_person_id", nullable = false)
    private Person createPerson;
    /**
     * 分类
     */
    @ManyToOne(targetEntity = BlogClassify.class)
    @JoinColumn(name = "classify", nullable = false)
    private BlogClassify classify;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Person getCreatePerson() {
        return createPerson;
    }

    public void setCreatePerson(Person createPerson) {
        this.createPerson = createPerson;
    }

    public BlogClassify getClassify() {
        return classify;
    }

    public void setClassify(BlogClassify classify) {
        this.classify = classify;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
