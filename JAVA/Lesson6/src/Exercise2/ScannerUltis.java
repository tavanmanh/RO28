package Exercise2;

import java.util.Scanner;

public class ScannerUltis {
    private static Scanner sc = new Scanner(System.in);
    //Question 7
    public static int[] inputInt() {
        while (true) {
            try {
                int[] arr = new int[2];
                System.out.println("Nhập vào id:");
                arr[0] = sc.nextInt();
                System.out.println("Nhập vào tuổi:");
                arr[1] = sc.nextInt();
                return arr;
            } catch (Exception e) {
                System.err.println("Không đúng định dạng nhập lại");
            }
        }
    }
    //Question 8
    public static Float inputFloat(String mes) {
        while (true) {
            try {
                return Float.parseFloat(sc.next());
            } catch (Exception e) {

                System.err.println("Nhập lại:");
            }
        }
    }
    public static Double inputDouble() {
        while (true) {
            try {
                return Double.parseDouble(sc.next());
            } catch (Exception e) {
                System.err.println("Nhập lại:");
            }
        }
    }
    public static String inputString() {
        while (true) {
            String string = sc.nextLine().trim();
            if (!string.isEmpty()) {
                return string;
            } else {
                System.err.println("Nhập lại:");
            }
        }
    }

    public static void main(String[] args) {

        System.out.println(ScannerUltis.inputString());
    }
}
