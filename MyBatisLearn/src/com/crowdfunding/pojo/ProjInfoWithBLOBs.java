package com.crowdfunding.pojo;

public class ProjInfoWithBLOBs extends ProjInfo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column proj_info.PROJ_CONTENT
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    private String projContent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column proj_info.DEVELOPER_CONTENT
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    private String developerContent;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column proj_info.PROJ_CONTENT
     *
     * @return the value of proj_info.PROJ_CONTENT
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    public String getProjContent() {
        return projContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column proj_info.PROJ_CONTENT
     *
     * @param projContent the value for proj_info.PROJ_CONTENT
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    public void setProjContent(String projContent) {
        this.projContent = projContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column proj_info.DEVELOPER_CONTENT
     *
     * @return the value of proj_info.DEVELOPER_CONTENT
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    public String getDeveloperContent() {
        return developerContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column proj_info.DEVELOPER_CONTENT
     *
     * @param developerContent the value for proj_info.DEVELOPER_CONTENT
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    public void setDeveloperContent(String developerContent) {
        this.developerContent = developerContent;
    }
}