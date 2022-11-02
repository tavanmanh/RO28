package com.vti.backend.Exercise6;

public class Manager extends User{
    public Manager(String name, Double salaryRatio) {
        super(name, salaryRatio);
    }
    @Override
    public Double calculatePay(Double salaryRatio) {
        return salaryRatio * 520;
    }
}
