package com.vti.backend;

public class Excercise4 {
    public static void main(String[] args) {
        Student st1 = new Student("name1", "H1");
        st1.plusScore(1f);
        Student st2 = new Student("name2", "H2");
        st2.plusScore(5f);
        Student st3 = new Student("name3", "H3");
        st3.plusScore(9f);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);

        Date date1 = new Date(25, 04, 2000);
        System.out.println( date1.isLeapYear());
    }
}
