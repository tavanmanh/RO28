package entity.Exercise2;

import entity.Exercise1.Insert;

public class MyMath {
    public static final Double PI = 3.14;
    public static double sum(int a) {
        return a + PI;
    }
    public static int max(int a, int b) {
        if (a <= b) {
            return b;
        } else {
            return a;
        }
    }
    public static int min(int a, int b) {
        if (a <= b) {
            return a;
        } else {
            return b;
        }
    }
    public static int sum(int a, int b) {
        return a + b;
    }
    public void question1() {
        System.out.println("Chương trình tính tổng số int với PI");
        System.out.println("Nhập vào 1 số int: ");
        int a = Insert.inputInt();
        System.out.println("Tổng với PI là: " + MyMath.sum(a));
    }

}
