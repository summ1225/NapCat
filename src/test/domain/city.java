package test.domain;

public class city {
    @Override
	public String toString() {
		return "city [id=" + id + ", name=" + name + ", CountryCode="
				+ CountryCode + ", District=" + District + ", Population="
				+ Population + "]";
	}

	/**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column city.ID
     *
     * @mbggenerated Mon Oct 24 23:07:54 CST 2016
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column city.Name
     *
     * @mbggenerated Mon Oct 24 23:07:54 CST 2016
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column city.CountryCode
     *
     * @mbggenerated Mon Oct 24 23:07:54 CST 2016
     */
    private String CountryCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column city.District
     *
     * @mbggenerated Mon Oct 24 23:07:54 CST 2016
     */
    private String District;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column city.Population
     *
     * @mbggenerated Mon Oct 24 23:07:54 CST 2016
     */
    private Integer Population;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column city.ID
     *
     * @return the value of city.ID
     *
     * @mbggenerated Mon Oct 24 23:07:54 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column city.ID
     *
     * @param id the value for city.ID
     *
     * @mbggenerated Mon Oct 24 23:07:54 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column city.Name
     *
     * @return the value of city.Name
     *
     * @mbggenerated Mon Oct 24 23:07:54 CST 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column city.Name
     *
     * @param name the value for city.Name
     *
     * @mbggenerated Mon Oct 24 23:07:54 CST 2016
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column city.CountryCode
     *
     * @return the value of city.CountryCode
     *
     * @mbggenerated Mon Oct 24 23:07:54 CST 2016
     */
    public String getCountryCode() {
        return CountryCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column city.CountryCode
     *
     * @param CountryCode the value for city.CountryCode
     *
     * @mbggenerated Mon Oct 24 23:07:54 CST 2016
     */
    public void setCountryCode(String CountryCode) {
        this.CountryCode = CountryCode == null ? null : CountryCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column city.District
     *
     * @return the value of city.District
     *
     * @mbggenerated Mon Oct 24 23:07:54 CST 2016
     */
    public String getDistrict() {
        return District;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column city.District
     *
     * @param District the value for city.District
     *
     * @mbggenerated Mon Oct 24 23:07:54 CST 2016
     */
    public void setDistrict(String District) {
        this.District = District == null ? null : District.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column city.Population
     *
     * @return the value of city.Population
     *
     * @mbggenerated Mon Oct 24 23:07:54 CST 2016
     */
    public Integer getPopulation() {
        return Population;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column city.Population
     *
     * @param Population the value for city.Population
     *
     * @mbggenerated Mon Oct 24 23:07:54 CST 2016
     */
    public void setPopulation(Integer Population) {
        this.Population = Population;
    }
}