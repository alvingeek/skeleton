package com.example.skeleton.model;

import java.util.Date;

public class Actor {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column actor.actor_id
     *
     * @mbg.generated Mon Mar 13 12:05:19 CST 2017
     */
    private Short actorId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column actor.first_name
     *
     * @mbg.generated Mon Mar 13 12:05:19 CST 2017
     */
    private String firstName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column actor.last_name
     *
     * @mbg.generated Mon Mar 13 12:05:19 CST 2017
     */
    private String lastName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column actor.last_update
     *
     * @mbg.generated Mon Mar 13 12:05:19 CST 2017
     */
    private Date lastUpdate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column actor.actor_id
     *
     * @return the value of actor.actor_id
     *
     * @mbg.generated Mon Mar 13 12:05:19 CST 2017
     */
    public Short getActorId() {
        return actorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column actor.actor_id
     *
     * @param actorId the value for actor.actor_id
     *
     * @mbg.generated Mon Mar 13 12:05:19 CST 2017
     */
    public void setActorId(Short actorId) {
        this.actorId = actorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column actor.first_name
     *
     * @return the value of actor.first_name
     *
     * @mbg.generated Mon Mar 13 12:05:19 CST 2017
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column actor.first_name
     *
     * @param firstName the value for actor.first_name
     *
     * @mbg.generated Mon Mar 13 12:05:19 CST 2017
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column actor.last_name
     *
     * @return the value of actor.last_name
     *
     * @mbg.generated Mon Mar 13 12:05:19 CST 2017
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column actor.last_name
     *
     * @param lastName the value for actor.last_name
     *
     * @mbg.generated Mon Mar 13 12:05:19 CST 2017
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column actor.last_update
     *
     * @return the value of actor.last_update
     *
     * @mbg.generated Mon Mar 13 12:05:19 CST 2017
     */
    public Date getLastUpdate() {
        return lastUpdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column actor.last_update
     *
     * @param lastUpdate the value for actor.last_update
     *
     * @mbg.generated Mon Mar 13 12:05:19 CST 2017
     */
    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}