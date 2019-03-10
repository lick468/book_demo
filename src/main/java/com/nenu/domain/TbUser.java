package com.nenu.domain;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "tb_user")
public class TbUser implements Serializable {
    private static final long serialVersionUID = 7901383179151667081L;
    /**
     * 用户ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户名
     */
    @Column(name = "u_name")
    private String uName;

    /**
     * 用户密码
     */
    @Column(name = "u_password")
    private String uPassword;

    /**
     * 手机号
     */
    @Column(name = "u_phone")
    private String uPhone;

    /**
     * 获取用户ID
     *
     * @return id - 用户ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置用户ID
     *
     * @param id 用户ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户名
     *
     * @return u_name - 用户名
     */
    public String getuName() {
        return uName;
    }

    /**
     * 设置用户名
     *
     * @param uName 用户名
     */
    public void setuName(String uName) {
        this.uName = uName;
    }

    /**
     * 获取用户密码
     *
     * @return u_password - 用户密码
     */
    public String getuPassword() {
        return uPassword;
    }

    /**
     * 设置用户密码
     *
     * @param uPassword 用户密码
     */
    public void setuPassword(String uPassword) {
        this.uPassword = uPassword;
    }

    /**
     * 获取手机号
     *
     * @return u_phone - 手机号
     */
    public String getuPhone() {
        return uPhone;
    }

    /**
     * 设置手机号
     *
     * @param uPhone 手机号
     */
    public void setuPhone(String uPhone) {
        this.uPhone = uPhone;
    }
}