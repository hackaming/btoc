package com.crowdfunding.mapper;

import com.crowdfunding.pojo.CrowdPayment;
import com.crowdfunding.pojo.CrowdPaymentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CrowdPaymentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table crowd_payment
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    long countByExample(CrowdPaymentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table crowd_payment
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    int deleteByExample(CrowdPaymentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table crowd_payment
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    int deleteByPrimaryKey(String uuid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table crowd_payment
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    int insert(CrowdPayment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table crowd_payment
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    int insertSelective(CrowdPayment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table crowd_payment
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    List<CrowdPayment> selectByExample(CrowdPaymentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table crowd_payment
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    CrowdPayment selectByPrimaryKey(String uuid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table crowd_payment
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    int updateByExampleSelective(@Param("record") CrowdPayment record, @Param("example") CrowdPaymentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table crowd_payment
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    int updateByExample(@Param("record") CrowdPayment record, @Param("example") CrowdPaymentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table crowd_payment
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    int updateByPrimaryKeySelective(CrowdPayment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table crowd_payment
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    int updateByPrimaryKey(CrowdPayment record);
}