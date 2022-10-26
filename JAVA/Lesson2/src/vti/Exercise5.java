package vti;

import java.util.Scanner;

public class Exercise5 {
    private static void question1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào 3 số nguyên");
        System.out.println("số 1 ");
        int a = sc.nextInt();
        System.out.println("số 2 ");
        int b = sc.nextInt();
        System.out.println("số 3: ");
        int c = sc.nextInt();
        System.out.println("các số: " + a + " " + b + " " + c);
    }
    private static void question2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("số 1: ");
        float f1 = sc.nextFloat();
        System.out.println("số 2: ");
        float f2 = sc.nextFloat();
        System.out.println("các số: " + f1 + " " + f2);
    }

    public static void question3() {
        Scanner sc = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Mời bạn nhập vào Họ: ");
        String s1 = sc.nextLine();
        System.out.println("Mời bạn nhập vào Tên: ");
        String s2 = sc.nextLine();
        System.out.println(s1 +" "+ s2);  // Output user input
    }
    private static void question5() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào thông tin account cân tạo:");
        Account acc = new Account();
        System.out.println("Nhập ID: ");
        acc.id = sc.nextInt();
        System.out.println("Nhập email: ");
        acc.email = sc.next();
        System.out.println("Nhập userName: ");
        acc.Username = sc.next();
        System.out.println("Nhập fullName: ");
        acc.FullName = sc.next();
        System.out.println("Nhập position (Nhập các số từ 1 đến 4 tương ứng với: 1.Dev, 2.Test, 3.Scrum_Master, 4.PM): ");
        int posNum = sc.nextInt();
        switch (posNum) {
            case 1:
                Position pos1 = new Position();
                pos1.PoName = Position.PositionName.Dev;
                acc.position = pos1;
                break;
            case 2:
                Position pos2 = new Position();
                pos2.PoName = Position.PositionName.Test;
                acc.position = pos2;
                break;
            case 3:
                Position pos3 = new Position();
                pos3.PoName = Position.PositionName.Scrum_Master;
                acc.position = pos3;
                break;
            case 4:
                Position pos4 = new Position();
                pos4.PoName = Position.PositionName.PM;
                acc.position = pos4;
                break;
        }
    }
    private static void question6() {
        Scanner sc = new Scanner(System.in);
        Department dep = new Department();
        System.out.println("Nhập ID: ");
        dep.id = sc.nextInt();
        System.out.println("Nhập Name: ");
        dep.DepartmentName = sc.next();
        System.out.println("Thông tin Department vừa nhập, ID: " + dep.id + " Name: "+dep.DepartmentName);
    }
    private static void question7() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Hãy nhập vào 1 số chẵn: ");
            int a = sc.nextInt();
            if (a % 2 == 0) {
                System.out.println("Bạm vừa nhập vào:" + a);
                break;
            } else {
                System.out.println("Nhập sai, Nhập lại");
            }
        }
    }

    private static void question8() {
        Scanner sc = new Scanner(System.in);
        int chon;
        while (true) {
            System.out.println("Mời bạn chọn chức năng: 1. Tạo Account, 2. Tạo Department");
            chon = sc.nextInt();
            if (chon == 1 || chon == 2) {
                switch (chon) {
                    case 1:
                        question5();
                        break;
                    case 2:
                        question6();
                        break;
                }
                break;
            } else {
                System.out.println("Nhập lại: ");
            }
        }
    }
    public static void main(String[] args) {
        question8();
    }
}
