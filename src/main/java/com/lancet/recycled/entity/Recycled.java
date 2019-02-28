package com.lancet.recycled.entity;

import com.lancet.person.entity.Person;
import com.sun.istack.internal.NotNull;

import javax.persistence.*;
import java.util.Date;

/**
 * @Description 回收站bean
 * @Date 2019-2-18 22:52
 * @Author GaoFei
 * @Version 1.0
 **/
@Entity
@Table(name = "recycled")
public class Recycled {
    /**
     * 主键id
     */
    @Id
    @GeneratedValue(generator = "gen", strategy = GenerationType.IDENTITY)
    @SequenceGenerator(name = "gen", sequenceName = "SEQ_CHECK_RESULT")
    @NotNull
    private int id;
    /**
     * 删除时间
     */
    @Column(nullable = false)
    private Date deleteTime;
    /**
     * 恢复时间
     */
    private Date restoreTime;
    /**
     * 实体id
     */
    @Column(nullable = false)
    private String entityId;
    /**
     * 实体class
     */
    @Column(nullable = false)
    private String entityClassName;
    /**
     * 实体属性(json格式{属性:值})
     */
    private StringBuffer entityPropertys;
    /**
     * 操作者
     */
    @ManyToOne(targetEntity = Person.class)
    @JoinColumn(name = "operate_person_id", nullable = false)
    private Person operatePersonId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }

    public Date getRestoreTime() {
        return restoreTime;
    }

    public void setRestoreTime(Date restoreTime) {
        this.restoreTime = restoreTime;
    }

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public String getEntityClassName() {
        return entityClassName;
    }

    public void setEntityClassName(String entityClassName) {
        this.entityClassName = entityClassName;
    }

    public StringBuffer getEntityPropertys() {
        return entityPropertys;
    }

    public void setEntityPropertys(StringBuffer entityPropertys) {
        this.entityPropertys = entityPropertys;
    }

    public Person getOperatePersonId() {
        return operatePersonId;
    }

    public void setOperatePersonId(Person operatePersonId) {
        this.operatePersonId = operatePersonId;
    }
}
