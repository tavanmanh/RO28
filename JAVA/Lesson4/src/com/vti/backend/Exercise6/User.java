package com.vti.backend.Exercise6;

public abstract class User {
    private String name;
    private Double salaryRatio;

    public User(String name, Double salaryRatio) {
        this.name = name;
        this.salaryRatio = salaryRatio;
    }

    public User() {
    }
    public abstract Double calculatePay(Double salaryRatio);
    public void displayInfor() {
        System.out.println("Name: " + this.name);
        System.out.println("Ration Salary: " + this.salaryRatio);
        System.out.println("Lương chi trả: " + calculatePay(this.salaryRatio));
    }
}
