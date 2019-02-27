package com.lancet.user.entity;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;
import java.util.Date;

/**
 * @Description 用户bean
 * @Date 2019-2-18 22:40
 * @Author GaoFei
 * @Version 1.0
 **/
@Entity
@Table(name = "lancet_user")
public class LancetUser {
    /**
     * 主键id
     */
    @Id
    @GeneratedValue(generator = "gen", strategy = GenerationType.IDENTITY)
    @SequenceGenerator(name = "gen", sequenceName = "SEQ_CHECK_RESULT")
    @NotNull
    private int id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(String lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
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
}
