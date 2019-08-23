package com.crowdfunding.mapper;

import com.crowdfunding.pojo.CrowdImage;
import com.crowdfunding.pojo.CrowdImageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CrowdImageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table crowd_image
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    long countByExample(CrowdImageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table crowd_image
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    int deleteByExample(CrowdImageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table crowd_image
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    int deleteByPrimaryKey(String uuid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table crowd_image
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    int insert(CrowdImage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table crowd_image
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    int insertSelective(CrowdImage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table crowd_image
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    List<CrowdImage> selectByExample(CrowdImageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table crowd_image
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    CrowdImage selectByPrimaryKey(String uuid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table crowd_image
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    int updateByExampleSelective(@Param("record") CrowdImage record, @Param("example") CrowdImageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table crowd_image
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    int updateByExample(@Param("record") CrowdImage record, @Param("example") CrowdImageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table crowd_image
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    int updateByPrimaryKeySelective(CrowdImage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table crowd_image
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    int updateByPrimaryKey(CrowdImage record);
}