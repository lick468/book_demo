package com.nenu.domain;

import javax.persistence.*;

@Table(name = "tb_role")
public class TbRole {
    /**
     * 权限ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 权限名称
     */
    @Column(name = "r_name")
    private String rName;

    /**
     * 获取权限ID
     *
     * @return id - 权限ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置权限ID
     *
     * @param id 权限ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取权限名称
     *
     * @return r_name - 权限名称
     */
    public String getrName() {
        return rName;
    }

    /**
     * 设置权限名称
     *
     * @param rName 权限名称
     */
    public void setrName(String rName) {
        this.rName = rName;
    }
}