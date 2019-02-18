package com.gaofei.lancet.entity;

import java.util.Date;

/**
 * @Description 回收站
 * @Date 2019-2-18 22:52
 * @Author GaoFei
 * @Version 1.0
 **/
public class Recycled {
    /**
     * 主键id
     */
    private String id;
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
    private String operateUserId;
}
