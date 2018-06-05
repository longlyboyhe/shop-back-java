package com.zq.shop.web.mappers;

import com.zq.shop.web.bean.Moments;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MomentsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zq_moments
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zq_moments
     *
     * @mbg.generated
     */
    int insert(Moments record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zq_moments
     *
     * @mbg.generated
     */
    int insertSelective(Moments record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zq_moments
     *
     * @mbg.generated
     */
    Moments selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zq_moments
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Moments record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zq_moments
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Moments record);

    List<Moments> findByUserId(@Param("userId") Integer userId);

    Integer findUserIdById(@Param("id") Integer id);

    List<Moments> find();

    int updateStarById(@Param("updatedStar") Integer updatedStar, @Param("id") Integer id);

    int updateSeeTimesById(@Param("updatedSeeTimes") Integer updatedSeeTimes, @Param("id") Integer id);


}