package com.crowdfunding.pojo;

import java.util.Date;

public class ProjReservation {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column proj_reservation.UUID
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    private String uuid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column proj_reservation.USER_UUID
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    private String userUuid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column proj_reservation.RESERVATION_DATE
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    private Date reservationDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column proj_reservation.RESERVATION_STOPDATE
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    private Date reservationStopdate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column proj_reservation.RESERVATION_PERSONNAME
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    private String reservationPersonname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column proj_reservation.RESERVATION_PHONENUMBER
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    private String reservationPhonenumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column proj_reservation.IS_RESERVATION
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    private String isReservation;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column proj_reservation.RESERVATION_TYPE
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    private String reservationType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column proj_reservation.RESERVATION_COUNT
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    private Integer reservationCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column proj_reservation.PROJ_UUID
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    private String projUuid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column proj_reservation.CANCEL
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    private String cancel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column proj_reservation.COMMENTS
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    private String comments;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column proj_reservation.UUID
     *
     * @return the value of proj_reservation.UUID
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column proj_reservation.UUID
     *
     * @param uuid the value for proj_reservation.UUID
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column proj_reservation.USER_UUID
     *
     * @return the value of proj_reservation.USER_UUID
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    public String getUserUuid() {
        return userUuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column proj_reservation.USER_UUID
     *
     * @param userUuid the value for proj_reservation.USER_UUID
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    public void setUserUuid(String userUuid) {
        this.userUuid = userUuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column proj_reservation.RESERVATION_DATE
     *
     * @return the value of proj_reservation.RESERVATION_DATE
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    public Date getReservationDate() {
        return reservationDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column proj_reservation.RESERVATION_DATE
     *
     * @param reservationDate the value for proj_reservation.RESERVATION_DATE
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column proj_reservation.RESERVATION_STOPDATE
     *
     * @return the value of proj_reservation.RESERVATION_STOPDATE
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    public Date getReservationStopdate() {
        return reservationStopdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column proj_reservation.RESERVATION_STOPDATE
     *
     * @param reservationStopdate the value for proj_reservation.RESERVATION_STOPDATE
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    public void setReservationStopdate(Date reservationStopdate) {
        this.reservationStopdate = reservationStopdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column proj_reservation.RESERVATION_PERSONNAME
     *
     * @return the value of proj_reservation.RESERVATION_PERSONNAME
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    public String getReservationPersonname() {
        return reservationPersonname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column proj_reservation.RESERVATION_PERSONNAME
     *
     * @param reservationPersonname the value for proj_reservation.RESERVATION_PERSONNAME
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    public void setReservationPersonname(String reservationPersonname) {
        this.reservationPersonname = reservationPersonname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column proj_reservation.RESERVATION_PHONENUMBER
     *
     * @return the value of proj_reservation.RESERVATION_PHONENUMBER
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    public String getReservationPhonenumber() {
        return reservationPhonenumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column proj_reservation.RESERVATION_PHONENUMBER
     *
     * @param reservationPhonenumber the value for proj_reservation.RESERVATION_PHONENUMBER
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    public void setReservationPhonenumber(String reservationPhonenumber) {
        this.reservationPhonenumber = reservationPhonenumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column proj_reservation.IS_RESERVATION
     *
     * @return the value of proj_reservation.IS_RESERVATION
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    public String getIsReservation() {
        return isReservation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column proj_reservation.IS_RESERVATION
     *
     * @param isReservation the value for proj_reservation.IS_RESERVATION
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    public void setIsReservation(String isReservation) {
        this.isReservation = isReservation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column proj_reservation.RESERVATION_TYPE
     *
     * @return the value of proj_reservation.RESERVATION_TYPE
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    public String getReservationType() {
        return reservationType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column proj_reservation.RESERVATION_TYPE
     *
     * @param reservationType the value for proj_reservation.RESERVATION_TYPE
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    public void setReservationType(String reservationType) {
        this.reservationType = reservationType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column proj_reservation.RESERVATION_COUNT
     *
     * @return the value of proj_reservation.RESERVATION_COUNT
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    public Integer getReservationCount() {
        return reservationCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column proj_reservation.RESERVATION_COUNT
     *
     * @param reservationCount the value for proj_reservation.RESERVATION_COUNT
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    public void setReservationCount(Integer reservationCount) {
        this.reservationCount = reservationCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column proj_reservation.PROJ_UUID
     *
     * @return the value of proj_reservation.PROJ_UUID
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    public String getProjUuid() {
        return projUuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column proj_reservation.PROJ_UUID
     *
     * @param projUuid the value for proj_reservation.PROJ_UUID
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    public void setProjUuid(String projUuid) {
        this.projUuid = projUuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column proj_reservation.CANCEL
     *
     * @return the value of proj_reservation.CANCEL
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    public String getCancel() {
        return cancel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column proj_reservation.CANCEL
     *
     * @param cancel the value for proj_reservation.CANCEL
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    public void setCancel(String cancel) {
        this.cancel = cancel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column proj_reservation.COMMENTS
     *
     * @return the value of proj_reservation.COMMENTS
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    public String getComments() {
        return comments;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column proj_reservation.COMMENTS
     *
     * @param comments the value for proj_reservation.COMMENTS
     *
     * @mbg.generated Fri Sep 21 13:43:03 CST 2018
     */
    public void setComments(String comments) {
        this.comments = comments;
    }
}