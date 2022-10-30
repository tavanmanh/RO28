package com.vti.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import static java.util.Calendar.DATE;

public class Lesson1 {
    public static void main(String[] args) {
        Department dep1 = new Department();
        dep1.id = 1;
        dep1.DepartmentName = "IT";
        Department dep2 = new Department();
        dep2.id = 2;
        dep2.DepartmentName = "Sale";
        Department dep3 = new Department();
        dep3.id = 3;
        dep3.DepartmentName = "MKT";

        Position pos1 = new Position();
        pos1.id = 1;
        pos1.PoName = Position.PositionName.Test;
        Position pos2 = new Position();
        pos2.id = 2;
        pos2.PoName = Position.PositionName.PM;
        Position pos3 = new Position();
        pos3.id = 3;
        pos3.PoName = Position.PositionName.Scrum_Master;

        Group gr1 = new Group();
        gr1.id = 1;
        gr1.groupName = "MKT";
        Group gr2 = new Group();
        gr2.id = 2;
        gr2.groupName = "IT";
        Group gr3 = new Group();
        gr3.id = 3;
        gr3.groupName = "Sale";

        Account acc1 = new Account();
        acc1.id = 1;
        acc1.email = "MANH";
        acc1.Username = "MANH";
        acc1.FullName = "TA VAN MANH";
        acc1.department = dep1;
        acc1.position = pos1;
        acc1.createDate = LocalDate.of(2021, 03, 17);
        Group[] groupAcc1 = { gr1, gr3 };
        acc1.groups = groupAcc1;

        Account acc2 = new Account();
        acc2.id = 2;
        acc2.email = "KHA";
        acc2.Username = "KHA";
        acc2.FullName = "TA VAN KHA";
        acc2.department = dep2;
        acc2.position = pos2;
        acc2.createDate = LocalDate.of(2021, 03, 17);
        Group[] groupAcc2 = { gr2, gr3 };
        acc1.groups = groupAcc2;

        Account acc3 = new Account();
        acc3.id = 3;
        acc3.email = "NGA";
        acc3.Username = "NGA";
        acc3.FullName = "NGUEY THI NGA";
        acc3.department = dep3;
        acc3.position = pos3;
        acc3.createDate = LocalDate.of(2021, 03, 17);


        System.out.println("Account 1: ID : " + acc1.id + " Email: " +

                acc1.email + " UserName: " + acc1.Username

                + " FullName: " + acc1.FullName + " Department: " +

                acc1.department.DepartmentName + " Position: "

                + acc1.position.PoName + " Group: "+ "CreateDate: " + acc1.createDate);


        System.out.println(acc3);

    }
}
