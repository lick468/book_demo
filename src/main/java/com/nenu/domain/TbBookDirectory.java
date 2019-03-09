package com.nenu.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_book_directory")
public class TbBookDirectory {
    /**
     * 目录
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 书ID
     */
    @Column(name = "bd_book_id")
    private Integer bdBookId;

    /**
     * 章节名
     */
    @Column(name = "b_num")
    private String bNum;

    /**
     * 章节发布时间
     */
    @Column(name = "b_date")
    private Date bDate;

    /**
     * 字数
     */
    @Column(name = "b_wordcount")
    private Integer bWordcount;

    /**
     * 章节内容
     */
    @Column(name = "b_content")
    private String bContent;

    /**
     * 获取目录
     *
     * @return id - 目录
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置目录
     *
     * @param id 目录
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取书ID
     *
     * @return bd_book_id - 书ID
     */
    public Integer getBdBookId() {
        return bdBookId;
    }

    /**
     * 设置书ID
     *
     * @param bdBookId 书ID
     */
    public void setBdBookId(Integer bdBookId) {
        this.bdBookId = bdBookId;
    }

    /**
     * 获取章节名
     *
     * @return b_num - 章节名
     */
    public String getbNum() {
        return bNum;
    }

    /**
     * 设置章节名
     *
     * @param bNum 章节名
     */
    public void setbNum(String bNum) {
        this.bNum = bNum;
    }

    /**
     * 获取章节发布时间
     *
     * @return b_date - 章节发布时间
     */
    public Date getbDate() {
        return bDate;
    }

    /**
     * 设置章节发布时间
     *
     * @param bDate 章节发布时间
     */
    public void setbDate(Date bDate) {
        this.bDate = bDate;
    }

    /**
     * 获取字数
     *
     * @return b_wordcount - 字数
     */
    public Integer getbWordcount() {
        return bWordcount;
    }

    /**
     * 设置字数
     *
     * @param bWordcount 字数
     */
    public void setbWordcount(Integer bWordcount) {
        this.bWordcount = bWordcount;
    }

    /**
     * 获取章节内容
     *
     * @return b_content - 章节内容
     */
    public String getbContent() {
        return bContent;
    }

    /**
     * 设置章节内容
     *
     * @param bContent 章节内容
     */
    public void setbContent(String bContent) {
        this.bContent = bContent;
    }
}