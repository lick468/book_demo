package com.nenu.domain;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "tb_book_catalogue")
public class TbBookCatalogue implements Serializable {
    private static final long serialVersionUID = -7323614668212789464L;
    /**
     * 书分类汇总ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 书编号
     */
    @Column(name = "bc_book_id")
    private Integer bcBookId;

    /**
     * 类别编号
     */
    @Column(name = "bc_c_id")
    private Integer bcCId;

    /**
     * 获取书分类汇总ID
     *
     * @return id - 书分类汇总ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置书分类汇总ID
     *
     * @param id 书分类汇总ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取书编号
     *
     * @return bc_book_id - 书编号
     */
    public Integer getBcBookId() {
        return bcBookId;
    }

    /**
     * 设置书编号
     *
     * @param bcBookId 书编号
     */
    public void setBcBookId(Integer bcBookId) {
        this.bcBookId = bcBookId;
    }

    /**
     * 获取类别编号
     *
     * @return bc_c_id - 类别编号
     */
    public Integer getBcCId() {
        return bcCId;
    }

    /**
     * 设置类别编号
     *
     * @param bcCId 类别编号
     */
    public void setBcCId(Integer bcCId) {
        this.bcCId = bcCId;
    }
}