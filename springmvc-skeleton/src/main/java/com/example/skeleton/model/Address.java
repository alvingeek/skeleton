package com.example.skeleton.model;

import java.util.Date;

public class Address {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column address.address_id
     *
     * @mbg.generated Mon Mar 13 12:05:19 CST 2017
     */
    private Short addressId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column address.address
     *
     * @mbg.generated Mon Mar 13 12:05:19 CST 2017
     */
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column address.address2
     *
     * @mbg.generated Mon Mar 13 12:05:19 CST 2017
     */
    private String address2;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column address.district
     *
     * @mbg.generated Mon Mar 13 12:05:19 CST 2017
     */
    private String district;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column address.city_id
     *
     * @mbg.generated Mon Mar 13 12:05:19 CST 2017
     */
    private Short cityId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column address.postal_code
     *
     * @mbg.generated Mon Mar 13 12:05:19 CST 2017
     */
    private String postalCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column address.phone
     *
     * @mbg.generated Mon Mar 13 12:05:19 CST 2017
     */
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column address.last_update
     *
     * @mbg.generated Mon Mar 13 12:05:19 CST 2017
     */
    private Date lastUpdate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column address.location
     *
     * @mbg.generated Mon Mar 13 12:05:19 CST 2017
     */
    private byte[] location;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column address.address_id
     *
     * @return the value of address.address_id
     *
     * @mbg.generated Mon Mar 13 12:05:19 CST 2017
     */
    public Short getAddressId() {
        return addressId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column address.address_id
     *
     * @param addressId the value for address.address_id
     *
     * @mbg.generated Mon Mar 13 12:05:19 CST 2017
     */
    public void setAddressId(Short addressId) {
        this.addressId = addressId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column address.address
     *
     * @return the value of address.address
     *
     * @mbg.generated Mon Mar 13 12:05:19 CST 2017
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column address.address
     *
     * @param address the value for address.address
     *
     * @mbg.generated Mon Mar 13 12:05:19 CST 2017
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column address.address2
     *
     * @return the value of address.address2
     *
     * @mbg.generated Mon Mar 13 12:05:19 CST 2017
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column address.address2
     *
     * @param address2 the value for address.address2
     *
     * @mbg.generated Mon Mar 13 12:05:19 CST 2017
     */
    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column address.district
     *
     * @return the value of address.district
     *
     * @mbg.generated Mon Mar 13 12:05:19 CST 2017
     */
    public String getDistrict() {
        return district;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column address.district
     *
     * @param district the value for address.district
     *
     * @mbg.generated Mon Mar 13 12:05:19 CST 2017
     */
    public void setDistrict(String district) {
        this.district = district;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column address.city_id
     *
     * @return the value of address.city_id
     *
     * @mbg.generated Mon Mar 13 12:05:19 CST 2017
     */
    public Short getCityId() {
        return cityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column address.city_id
     *
     * @param cityId the value for address.city_id
     *
     * @mbg.generated Mon Mar 13 12:05:19 CST 2017
     */
    public void setCityId(Short cityId) {
        this.cityId = cityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column address.postal_code
     *
     * @return the value of address.postal_code
     *
     * @mbg.generated Mon Mar 13 12:05:19 CST 2017
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column address.postal_code
     *
     * @param postalCode the value for address.postal_code
     *
     * @mbg.generated Mon Mar 13 12:05:19 CST 2017
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column address.phone
     *
     * @return the value of address.phone
     *
     * @mbg.generated Mon Mar 13 12:05:19 CST 2017
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column address.phone
     *
     * @param phone the value for address.phone
     *
     * @mbg.generated Mon Mar 13 12:05:19 CST 2017
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column address.last_update
     *
     * @return the value of address.last_update
     *
     * @mbg.generated Mon Mar 13 12:05:19 CST 2017
     */
    public Date getLastUpdate() {
        return lastUpdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column address.last_update
     *
     * @param lastUpdate the value for address.last_update
     *
     * @mbg.generated Mon Mar 13 12:05:19 CST 2017
     */
    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column address.location
     *
     * @return the value of address.location
     *
     * @mbg.generated Mon Mar 13 12:05:19 CST 2017
     */
    public byte[] getLocation() {
        return location;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column address.location
     *
     * @param location the value for address.location
     *
     * @mbg.generated Mon Mar 13 12:05:19 CST 2017
     */
    public void setLocation(byte[] location) {
        this.location = location;
    }
}