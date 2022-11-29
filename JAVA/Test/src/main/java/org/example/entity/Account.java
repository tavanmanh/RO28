package org.example.entity;

import javax.swing.*;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;

public class Account {
    public Integer id;
    public String email;
    public String userName;
    public String fullName;
    public String gender;
    public int departmentID;
    public int potisionID;
    public Date createDate;

    public Date getCreateDate() {
        return createDate;
    }

    public Account() {
    }

    public Account(int id, String email, String userName, String fullName, String gender, int departmentID, int potisionID, Date createDate) {
        this.id = id;
        this.email = email;
        this.userName = userName;
        this.fullName = fullName;
        this.gender = gender;
        this.departmentID = departmentID;
        this.potisionID = potisionID;
        this.createDate = createDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    public int getPotisionID() {
        return potisionID;
    }

    public void setPotisionID(int potisionID) {
        this.potisionID = potisionID;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", userName='" + userName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", gender='" + gender + '\'' +
                ", departmentID=" + departmentID +
                ", potisionID=" + potisionID +
                ", createDate=" + createDate +
                '}';
    }
}
