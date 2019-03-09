package com.nenu.domain;

import javax.persistence.*;

@Table(name = "tb_user_role")
public class TbUserRole {
    /**
     * ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户ID
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 权限ID
     */
    @Column(name = "role_id")
    private Integer roleId;

    /**
     * 获取ID
     *
     * @return id - ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置ID
     *
     * @param id ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户ID
     *
     * @return user_id - 用户ID
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户ID
     *
     * @param userId 用户ID
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取权限ID
     *
     * @return role_id - 权限ID
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * 设置权限ID
     *
     * @param roleId 权限ID
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}