package com.vti.entity;

import java.util.Date;

public class Group {
    public int id;
    public String groupName;
    public Account creator;
    public Date createDate;
    public Account[] accounts;
}
