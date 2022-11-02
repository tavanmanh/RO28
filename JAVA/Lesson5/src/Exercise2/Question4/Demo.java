package Exercise2.Question4;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyMath myMath = new MyMath();
        while (true) {
            System.out.println(" 1. Tính tổng 2 số kiểu int. ");
            System.out.println(" 2. Tính tổng 2 số kiểu byte. ");
            System.out.println(" 3. Thoát ");
            int menuChoose = sc.nextInt();
            switch (menuChoose) {
                case 1:
                    System.out.println("Nhập vào số int 1: ");
                    int int1 = sc.nextInt();
                    System.out.println("Nhập vào số int 2: ");
                    int int2 = sc.nextInt();
                    System.out.println("Tổng 2 số là: " + myMath.getSum(int1, int2));
                    break;

                case 2:
                    System.out.println("Nhập vào số byte 1: ");
                    byte byte1 = sc.nextByte();
                    System.out.println("Nhập vào số byte 2: ");
                    byte byte2 = sc.nextByte();
                    System.out.println("Tổng 2 số là: " + myMath.getSum(byte1, byte2));
                    break;
                case 3:
                    return;
            }
        }
    }
}
