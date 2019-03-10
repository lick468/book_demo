package com.nenu.domain;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "tb_book")
public class TbBook implements Serializable {


    private static final long serialVersionUID = 4405014096416445159L;
    /**
     * 书ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 书名(唯一)
     */
    @Column(name = "b_name")
    private String bName;

    /**
     * 作者
     */
    @Column(name = "b_author")
    private String bAuthor;

    /**
     * 简介
     */
    @Column(name = "b_info")
    private String bInfo;

    /**
     * 封皮
     */
    @Column(name = "b_image")
    private String bImage;

    /**
     * 总字数
     */
    @Column(name = "b_wordcount")
    private Integer bWordcount;

    /**
     * 点击数
     */
    @Column(name = "b_click")
    private Integer bClick;

    /**
     * 推荐数
     */
    @Column(name = "b_recommend")
    private Integer bRecommend;

    /**
     * 下载链接
     */
    @Column(name = "b_downlaod")
    private String bDownlaod;

    /**
     * 状态 0:审核中 1:连载  2:完本  3:删除
     */
    @Column(name = "b_state")
    private Integer bState;

    /**
     * 获取书ID
     *
     * @return id - 书ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置书ID
     *
     * @param id 书ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取书名(唯一)
     *
     * @return b_name - 书名(唯一)
     */
    public String getbName() {
        return bName;
    }

    /**
     * 设置书名(唯一)
     *
     * @param bName 书名(唯一)
     */
    public void setbName(String bName) {
        this.bName = bName;
    }

    /**
     * 获取作者
     *
     * @return b_author - 作者
     */
    public String getbAuthor() {
        return bAuthor;
    }

    /**
     * 设置作者
     *
     * @param bAuthor 作者
     */
    public void setbAuthor(String bAuthor) {
        this.bAuthor = bAuthor;
    }

    /**
     * 获取简介
     *
     * @return b_info - 简介
     */
    public String getbInfo() {
        return bInfo;
    }

    /**
     * 设置简介
     *
     * @param bInfo 简介
     */
    public void setbInfo(String bInfo) {
        this.bInfo = bInfo;
    }

    /**
     * 获取封皮
     *
     * @return b_image - 封皮
     */
    public String getbImage() {
        return bImage;
    }

    /**
     * 设置封皮
     *
     * @param bImage 封皮
     */
    public void setbImage(String bImage) {
        this.bImage = bImage;
    }

    /**
     * 获取总字数
     *
     * @return b_wordcount - 总字数
     */
    public Integer getbWordcount() {
        return bWordcount;
    }

    /**
     * 设置总字数
     *
     * @param bWordcount 总字数
     */
    public void setbWordcount(Integer bWordcount) {
        this.bWordcount = bWordcount;
    }

    /**
     * 获取点击数
     *
     * @return b_click - 点击数
     */
    public Integer getbClick() {
        return bClick;
    }

    /**
     * 设置点击数
     *
     * @param bClick 点击数
     */
    public void setbClick(Integer bClick) {
        this.bClick = bClick;
    }

    /**
     * 获取推荐数
     *
     * @return b_recommend - 推荐数
     */
    public Integer getbRecommend() {
        return bRecommend;
    }

    /**
     * 设置推荐数
     *
     * @param bRecommend 推荐数
     */
    public void setbRecommend(Integer bRecommend) {
        this.bRecommend = bRecommend;
    }

    /**
     * 获取下载链接
     *
     * @return b_downlaod - 下载链接
     */
    public String getbDownlaod() {
        return bDownlaod;
    }

    /**
     * 设置下载链接
     *
     * @param bDownlaod 下载链接
     */
    public void setbDownlaod(String bDownlaod) {
        this.bDownlaod = bDownlaod;
    }

    /**
     * 获取状态 0:审核中 1:连载  2:完本  3:删除
     *
     * @return b_state - 状态 0:审核中 1:连载  2:完本  3:删除
     */
    public Integer getbState() {
        return bState;
    }

    /**
     * 设置状态 0:审核中 1:连载  2:完本  3:删除
     *
     * @param bState 状态 0:审核中 1:连载  2:完本  3:删除
     */
    public void setbState(Integer bState) {
        this.bState = bState;
    }
}