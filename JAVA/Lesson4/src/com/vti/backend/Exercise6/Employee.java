package com.vti.backend.Exercise6;

public class Employee extends User{
    public Employee(String name, Double salaryRatio) {
        super(name, salaryRatio);
    }
    @Override
    public Double calculatePay(Double salaryRatio) {
        return salaryRatio * 420;
    }
}
