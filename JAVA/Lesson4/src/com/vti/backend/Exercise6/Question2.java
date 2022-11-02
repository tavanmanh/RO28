package com.vti.backend.Exercise6;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập vào tên Nhan Vien: ");
        String emName = sc.next();
        System.out.println("Nhập vào he so Luong: ");
        Double emSalaryRatio = sc.nextDouble();
        Employee em= new Employee(emName,emSalaryRatio);
        em.displayInfor();


    }
}
