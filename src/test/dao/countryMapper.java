package test.dao;

import test.domain.country;

public interface countryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table country
     *
     * @mbggenerated Mon Oct 24 23:07:54 CST 2016
     */
    int deleteByPrimaryKey(String Code);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table country
     *
     * @mbggenerated Mon Oct 24 23:07:54 CST 2016
     */
    int insert(country record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table country
     *
     * @mbggenerated Mon Oct 24 23:07:54 CST 2016
     */
    int insertSelective(country record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table country
     *
     * @mbggenerated Mon Oct 24 23:07:54 CST 2016
     */
    country selectByPrimaryKey(String Code);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table country
     *
     * @mbggenerated Mon Oct 24 23:07:54 CST 2016
     */
    int updateByPrimaryKeySelective(country record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table country
     *
     * @mbggenerated Mon Oct 24 23:07:54 CST 2016
     */
    int updateByPrimaryKey(country record);
}