package com.aoseala.test.domain;

import java.util.Date;

public class Post {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column post.id
     *
     * @mbggenerated Tue Apr 16 11:09:59 CST 2013
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column post.uid
     *
     * @mbggenerated Tue Apr 16 11:09:59 CST 2013
     */
    private Integer uid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column post.title
     *
     * @mbggenerated Tue Apr 16 11:09:59 CST 2013
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column post.createtime
     *
     * @mbggenerated Tue Apr 16 11:09:59 CST 2013
     */
    private Date createtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column post.content
     *
     * @mbggenerated Tue Apr 16 11:09:59 CST 2013
     */
    private String content;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column post.id
     *
     * @return the value of post.id
     *
     * @mbggenerated Tue Apr 16 11:09:59 CST 2013
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column post.id
     *
     * @param id the value for post.id
     *
     * @mbggenerated Tue Apr 16 11:09:59 CST 2013
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column post.uid
     *
     * @return the value of post.uid
     *
     * @mbggenerated Tue Apr 16 11:09:59 CST 2013
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column post.uid
     *
     * @param uid the value for post.uid
     *
     * @mbggenerated Tue Apr 16 11:09:59 CST 2013
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column post.title
     *
     * @return the value of post.title
     *
     * @mbggenerated Tue Apr 16 11:09:59 CST 2013
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column post.title
     *
     * @param title the value for post.title
     *
     * @mbggenerated Tue Apr 16 11:09:59 CST 2013
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column post.createtime
     *
     * @return the value of post.createtime
     *
     * @mbggenerated Tue Apr 16 11:09:59 CST 2013
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column post.createtime
     *
     * @param createtime the value for post.createtime
     *
     * @mbggenerated Tue Apr 16 11:09:59 CST 2013
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column post.content
     *
     * @return the value of post.content
     *
     * @mbggenerated Tue Apr 16 11:09:59 CST 2013
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column post.content
     *
     * @param content the value for post.content
     *
     * @mbggenerated Tue Apr 16 11:09:59 CST 2013
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}