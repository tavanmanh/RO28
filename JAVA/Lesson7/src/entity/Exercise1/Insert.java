package entity.Exercise1;

import java.util.Scanner;

public class Insert {
    public static Scanner sc= new Scanner(System.in);
    public static String inputString() {
            String string = sc.nextLine();
                return string;
        }

    public static Float inputFloat() {
        while (true) {
            try {
                return sc.nextFloat();
            } catch (Exception e) {
                System.err.println("Nhập lại:");
            }
        }
    }
    public static int inputInt() {
        while (true) {
            try {
                return sc.nextInt();
            } catch (Exception e) {
                System.err.println("Nhập lại:");
            }
        }
    }
}

