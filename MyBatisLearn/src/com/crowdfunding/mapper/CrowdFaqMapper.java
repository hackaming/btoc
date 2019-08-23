package com.crowdfunding.mapper;

import com.crowdfunding.pojo.CrowdFaq;
import com.crowdfunding.pojo.CrowdFaqExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CrowdFaqMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table crowd_faq
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    long countByExample(CrowdFaqExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table crowd_faq
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    int deleteByExample(CrowdFaqExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table crowd_faq
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    int deleteByPrimaryKey(String uuid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table crowd_faq
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    int insert(CrowdFaq record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table crowd_faq
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    int insertSelective(CrowdFaq record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table crowd_faq
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    List<CrowdFaq> selectByExampleWithBLOBs(CrowdFaqExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table crowd_faq
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    List<CrowdFaq> selectByExample(CrowdFaqExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table crowd_faq
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    CrowdFaq selectByPrimaryKey(String uuid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table crowd_faq
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    int updateByExampleSelective(@Param("record") CrowdFaq record, @Param("example") CrowdFaqExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table crowd_faq
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") CrowdFaq record, @Param("example") CrowdFaqExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table crowd_faq
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    int updateByExample(@Param("record") CrowdFaq record, @Param("example") CrowdFaqExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table crowd_faq
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    int updateByPrimaryKeySelective(CrowdFaq record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table crowd_faq
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(CrowdFaq record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table crowd_faq
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    int updateByPrimaryKey(CrowdFaq record);
}