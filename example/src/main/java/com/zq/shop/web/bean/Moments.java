package com.zq.shop.web.bean;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table zq_moments
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class Moments {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column zq_moments.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     * Database Column Remarks:
     *   用户id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column zq_moments.user_id
     *
     * @mbg.generated
     */
    private Integer userId;

    /**
     * Database Column Remarks:
     *   类型
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column zq_moments.category
     *
     * @mbg.generated
     */
    private Integer category;

    /**
     * Database Column Remarks:
     *   状态
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column zq_moments.status
     *
     * @mbg.generated
     */
    private Integer status;

    /**
     * Database Column Remarks:
     *   类别
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column zq_moments.type
     *
     * @mbg.generated
     */
    private Integer type;

    /**
     * Database Column Remarks:
     *   文章名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column zq_moments.title
     *
     * @mbg.generated
     */
    private String title;

    /**
     * Database Column Remarks:
     *   文章副标题
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column zq_moments.subtitle
     *
     * @mbg.generated
     */
    private String subtitle;

    /**
     * Database Column Remarks:
     *   详情
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column zq_moments.details
     *
     * @mbg.generated
     */
    private String details;

    /**
     * Database Column Remarks:
     *   主图片
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column zq_moments.main_image
     *
     * @mbg.generated
     */
    private String mainImage;

    /**
     * Database Column Remarks:
     *   副图片
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column zq_moments.sub_images
     *
     * @mbg.generated
     */
    private String subImages;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column zq_moments.last_see_time
     *
     * @mbg.generated
     */
    private Date lastSeeTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column zq_moments.star
     *
     * @mbg.generated
     */
    private Integer star;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column zq_moments.see_times
     *
     * @mbg.generated
     */
    private Integer seeTimes;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column zq_moments.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column zq_moments.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column zq_moments.id
     *
     * @return the value of zq_moments.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column zq_moments.id
     *
     * @param id the value for zq_moments.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column zq_moments.user_id
     *
     * @return the value of zq_moments.user_id
     *
     * @mbg.generated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column zq_moments.user_id
     *
     * @param userId the value for zq_moments.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column zq_moments.category
     *
     * @return the value of zq_moments.category
     *
     * @mbg.generated
     */
    public Integer getCategory() {
        return category;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column zq_moments.category
     *
     * @param category the value for zq_moments.category
     *
     * @mbg.generated
     */
    public void setCategory(Integer category) {
        this.category = category;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column zq_moments.status
     *
     * @return the value of zq_moments.status
     *
     * @mbg.generated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column zq_moments.status
     *
     * @param status the value for zq_moments.status
     *
     * @mbg.generated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column zq_moments.type
     *
     * @return the value of zq_moments.type
     *
     * @mbg.generated
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column zq_moments.type
     *
     * @param type the value for zq_moments.type
     *
     * @mbg.generated
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column zq_moments.title
     *
     * @return the value of zq_moments.title
     *
     * @mbg.generated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column zq_moments.title
     *
     * @param title the value for zq_moments.title
     *
     * @mbg.generated
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column zq_moments.subtitle
     *
     * @return the value of zq_moments.subtitle
     *
     * @mbg.generated
     */
    public String getSubtitle() {
        return subtitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column zq_moments.subtitle
     *
     * @param subtitle the value for zq_moments.subtitle
     *
     * @mbg.generated
     */
    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column zq_moments.details
     *
     * @return the value of zq_moments.details
     *
     * @mbg.generated
     */
    public String getDetails() {
        return details;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column zq_moments.details
     *
     * @param details the value for zq_moments.details
     *
     * @mbg.generated
     */
    public void setDetails(String details) {
        this.details = details;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column zq_moments.main_image
     *
     * @return the value of zq_moments.main_image
     *
     * @mbg.generated
     */
    public String getMainImage() {
        return mainImage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column zq_moments.main_image
     *
     * @param mainImage the value for zq_moments.main_image
     *
     * @mbg.generated
     */
    public void setMainImage(String mainImage) {
        this.mainImage = mainImage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column zq_moments.sub_images
     *
     * @return the value of zq_moments.sub_images
     *
     * @mbg.generated
     */
    public String getSubImages() {
        return subImages;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column zq_moments.sub_images
     *
     * @param subImages the value for zq_moments.sub_images
     *
     * @mbg.generated
     */
    public void setSubImages(String subImages) {
        this.subImages = subImages;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column zq_moments.last_see_time
     *
     * @return the value of zq_moments.last_see_time
     *
     * @mbg.generated
     */
    public Date getLastSeeTime() {
        return lastSeeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column zq_moments.last_see_time
     *
     * @param lastSeeTime the value for zq_moments.last_see_time
     *
     * @mbg.generated
     */
    public void setLastSeeTime(Date lastSeeTime) {
        this.lastSeeTime = lastSeeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column zq_moments.star
     *
     * @return the value of zq_moments.star
     *
     * @mbg.generated
     */
    public Integer getStar() {
        return star;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column zq_moments.star
     *
     * @param star the value for zq_moments.star
     *
     * @mbg.generated
     */
    public void setStar(Integer star) {
        this.star = star;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column zq_moments.see_times
     *
     * @return the value of zq_moments.see_times
     *
     * @mbg.generated
     */
    public Integer getSeeTimes() {
        return seeTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column zq_moments.see_times
     *
     * @param seeTimes the value for zq_moments.see_times
     *
     * @mbg.generated
     */
    public void setSeeTimes(Integer seeTimes) {
        this.seeTimes = seeTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column zq_moments.create_time
     *
     * @return the value of zq_moments.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column zq_moments.create_time
     *
     * @param createTime the value for zq_moments.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column zq_moments.update_time
     *
     * @return the value of zq_moments.update_time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column zq_moments.update_time
     *
     * @param updateTime the value for zq_moments.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}