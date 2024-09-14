package in.co.sunrays.bean;

import java.io.Serializable;

/*
 * @Copyright (c) SunilOS. All rights reserved.
 * @URL www.SunilOS.com
 */

public class Employee implements Serializable {

    // Unique identifier for each employee
    private int id;

    // Employee's first name
    private String firstName;

    // Employee's last name
    private String lastName;

    // Transient variable; not serialized
    private transient String tempValue;

    // Static constant for retirement age
    private static int RETIREMENT_AGE = 60;

    // Default constructor
    public Employee() {

    }

    // Parameterized constructor
    public Employee(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getter for firstName
    public String getFirstName() {
        return firstName;
    }

    // Setter for firstName
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter for id
    public int getId() {
        return id;
    }

    // Setter for id
    public void setId(int id) {
        this.id = id;
    }

    // Getter for lastName
    public String getLastName() {
        return lastName;
    }

    // Setter for lastName
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the tempValue
     */
    public String getTempValue() {
        return tempValue;
    }

    /**
     * @param tempValue the tempValue to set
     */
    public void setTempValue(String tempValue) {
        this.tempValue = tempValue;
    }

    @Override
    public String toString() {
        // Generating a string representation of the Employee object
        StringBuffer sb = new StringBuffer("");
        sb.append("ID : " + getId());
        sb.append("\nName : " + getFirstName());
        sb.append("\nLast Name : " + getLastName());

        return sb.toString();
    }
}
