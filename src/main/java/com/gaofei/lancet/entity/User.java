package com.gaofei.lancet.entity;

import java.util.Date;

/**
 * @Description 用户bean
 * @Date 2019-2-18 22:40
 * @Author GaoFei
 * @Version 1.0
 **/
public class User {
    /**
     * 主键id
     */
    private String id;
    /**
     * 用户名
     */
    private String name;
    /**
     * 登陆名
     */
    private String loginName;
    /**
     * 登陆密码
     */
    private String password;
    /**
     * 最后登陆时间
     */
    private String lastLoginTime;
    /**
     * 用户状态
     */
    private String state;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 最后修改时间
     */
    private Date lastModifyTime;

}
