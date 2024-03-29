package com.crowdfunding.mapper;

import com.crowdfunding.pojo.ActivityReservation;
import com.crowdfunding.pojo.ActivityReservationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivityReservationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_reservation
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    long countByExample(ActivityReservationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_reservation
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    int deleteByExample(ActivityReservationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_reservation
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    int deleteByPrimaryKey(String uuid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_reservation
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    int insert(ActivityReservation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_reservation
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    int insertSelective(ActivityReservation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_reservation
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    List<ActivityReservation> selectByExample(ActivityReservationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_reservation
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    ActivityReservation selectByPrimaryKey(String uuid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_reservation
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    int updateByExampleSelective(@Param("record") ActivityReservation record, @Param("example") ActivityReservationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_reservation
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    int updateByExample(@Param("record") ActivityReservation record, @Param("example") ActivityReservationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_reservation
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    int updateByPrimaryKeySelective(ActivityReservation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_reservation
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    int updateByPrimaryKey(ActivityReservation record);
}