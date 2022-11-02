package com.vti.backend.Exercise6;

public class Waiter extends User{
    public Employee(String name, Double salaryRatio) {
        super(name, salaryRatio);
    }
    @Override
    public Double calculatePay(Double salaryRatio) {
        return salaryRatio * 220;
    }
}
