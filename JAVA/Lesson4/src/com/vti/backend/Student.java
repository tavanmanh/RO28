package com.vti.backend;

public class Student {
    private int id;
    private String name;
    private String hometown;
    private Float score;

    public Student(int id, String name, String hometown, Float score) {
        this.id = id;
        this.name = name;
        this.hometown = hometown;
        this.score = score;
    }

    public Student() {
    }

    public Student(String name, String hometown) {
        this.name = name;
        this.hometown = hometown;
        this.score = (float) 0;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public void plusScore(Float score) {
        this.score = this.score + score;
    }

    public String toString() {
        String rank = "";
        if (this.score < 4.0) {
            rank = "Yếu";
        } else if (this.score < 6.0) {
            rank = "Trung Bình";
        } else if (this.score < 8.0) {
            rank = "Khá";
        }else {
            rank = "Giỏi";
        }
        return "Student [id=" + id + ", name=" + name + ", hometown=" + hometown + ", score=" + score + ", Xếp loại=" + rank + "]";
    }
}
