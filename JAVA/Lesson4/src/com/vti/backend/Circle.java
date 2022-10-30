package com.vti.backend;

public class Circle {
    private Double radius;
    private String color;

    public Circle() {
    }

    public Circle(Double radius) {
        this.radius = radius;
    }

    public Circle(Double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
