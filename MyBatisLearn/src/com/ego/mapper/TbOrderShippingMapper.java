package com.ego.mapper;

import com.ego.pojo.TbOrderShipping;
import com.ego.pojo.TbOrderShippingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbOrderShippingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_shipping
     *
     * @mbg.generated Thu Aug 22 20:29:54 CST 2019
     */
    long countByExample(TbOrderShippingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_shipping
     *
     * @mbg.generated Thu Aug 22 20:29:54 CST 2019
     */
    int deleteByExample(TbOrderShippingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_shipping
     *
     * @mbg.generated Thu Aug 22 20:29:54 CST 2019
     */
    int deleteByPrimaryKey(String orderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_shipping
     *
     * @mbg.generated Thu Aug 22 20:29:54 CST 2019
     */
    int insert(TbOrderShipping record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_shipping
     *
     * @mbg.generated Thu Aug 22 20:29:54 CST 2019
     */
    int insertSelective(TbOrderShipping record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_shipping
     *
     * @mbg.generated Thu Aug 22 20:29:54 CST 2019
     */
    List<TbOrderShipping> selectByExample(TbOrderShippingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_shipping
     *
     * @mbg.generated Thu Aug 22 20:29:54 CST 2019
     */
    TbOrderShipping selectByPrimaryKey(String orderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_shipping
     *
     * @mbg.generated Thu Aug 22 20:29:54 CST 2019
     */
    int updateByExampleSelective(@Param("record") TbOrderShipping record, @Param("example") TbOrderShippingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_shipping
     *
     * @mbg.generated Thu Aug 22 20:29:54 CST 2019
     */
    int updateByExample(@Param("record") TbOrderShipping record, @Param("example") TbOrderShippingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_shipping
     *
     * @mbg.generated Thu Aug 22 20:29:54 CST 2019
     */
    int updateByPrimaryKeySelective(TbOrderShipping record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_shipping
     *
     * @mbg.generated Thu Aug 22 20:29:54 CST 2019
     */
    int updateByPrimaryKey(TbOrderShipping record);
}