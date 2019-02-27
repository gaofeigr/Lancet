package com.lancet.recycled.entity;

import com.lancet.user.entity.LancetUser;
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
@Table(name = "lancet_recycled")
public class LancetRecycled {
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
    private Date deleteTime;
    /**
     * 恢复时间
     */
    private Date restoreTime;
    /**
     * 实体id
     */
    private String entityId;
    /**
     * 实体class
     */
    private String entityClassName;
    /**
     * 实体属性(json格式{属性:值})
     */
    private StringBuffer entityPropertys;
    /**
     * 操作者
     */
    @ManyToOne(targetEntity = LancetUser.class)
    @JoinColumn(name = "operate_user_id")
    private LancetUser operateUserId;

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

    public LancetUser getOperateUserId() {
        return operateUserId;
    }

    public void setOperateUserId(LancetUser operateUserId) {
        this.operateUserId = operateUserId;
    }
}
