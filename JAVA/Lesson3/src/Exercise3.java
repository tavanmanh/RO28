import java.util.Scanner;

public class Exercise3 {
    public static void question1() {
        Integer a = 5000;
        float x= (float) a;
        System.out.printf("%.2f", (float) x);
    }
    public static void question2() {
        String s = "1234567";
        int i = Integer.parseInt(s);
        System.out.println(i);
    }
    public static void question3() {
        Integer i = 1234567;
        int i1 = (int) i;
        System.out.println(i1);
    }

    public static void main(String[] args) {
        question3();
    }
}
