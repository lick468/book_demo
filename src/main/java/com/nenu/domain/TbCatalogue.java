package com.nenu.domain;

import javax.persistence.*;

@Table(name = "tb_catalogue")
public class TbCatalogue {
    /**
     * 书分类ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 书分类类型名
     */
    @Column(name = "c_name")
    private String cName;

    /**
     * 获取书分类ID
     *
     * @return id - 书分类ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置书分类ID
     *
     * @param id 书分类ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取书分类类型名
     *
     * @return c_name - 书分类类型名
     */
    public String getcName() {
        return cName;
    }

    /**
     * 设置书分类类型名
     *
     * @param cName 书分类类型名
     */
    public void setcName(String cName) {
        this.cName = cName;
    }
}