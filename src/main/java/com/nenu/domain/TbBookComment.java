package com.nenu.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_book_comment")
public class TbBookComment implements Serializable {
    private static final long serialVersionUID = -4129695082459014677L;
    /**
     * 评论ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户ID
     */
    @Column(name = "bc_user_id")
    private Integer bcUserId;

    /**
     * 评论内容
     */
    @Column(name = "bc_content")
    private String bcContent;

    /**
     * 评论时间
     */
    @Column(name = "bc_date")
    private Date bcDate;

    /**
     * 上级评论
     */
    @Column(name = "bc_parentID")
    private Integer bcParentid;

    /**
     * 赞同数
     */
    @Column(name = "bc_agree")
    private Integer bcAgree;

    /**
     * 获取评论ID
     *
     * @return id - 评论ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置评论ID
     *
     * @param id 评论ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户ID
     *
     * @return bc_user_id - 用户ID
     */
    public Integer getBcUserId() {
        return bcUserId;
    }

    /**
     * 设置用户ID
     *
     * @param bcUserId 用户ID
     */
    public void setBcUserId(Integer bcUserId) {
        this.bcUserId = bcUserId;
    }

    /**
     * 获取评论内容
     *
     * @return bc_content - 评论内容
     */
    public String getBcContent() {
        return bcContent;
    }

    /**
     * 设置评论内容
     *
     * @param bcContent 评论内容
     */
    public void setBcContent(String bcContent) {
        this.bcContent = bcContent;
    }

    /**
     * 获取评论时间
     *
     * @return bc_date - 评论时间
     */
    public Date getBcDate() {
        return bcDate;
    }

    /**
     * 设置评论时间
     *
     * @param bcDate 评论时间
     */
    public void setBcDate(Date bcDate) {
        this.bcDate = bcDate;
    }

    /**
     * 获取上级评论
     *
     * @return bc_parentID - 上级评论
     */
    public Integer getBcParentid() {
        return bcParentid;
    }

    /**
     * 设置上级评论
     *
     * @param bcParentid 上级评论
     */
    public void setBcParentid(Integer bcParentid) {
        this.bcParentid = bcParentid;
    }

    /**
     * 获取赞同数
     *
     * @return bc_agree - 赞同数
     */
    public Integer getBcAgree() {
        return bcAgree;
    }

    /**
     * 设置赞同数
     *
     * @param bcAgree 赞同数
     */
    public void setBcAgree(Integer bcAgree) {
        this.bcAgree = bcAgree;
    }
}