package com.vti.backend.Exercise6;

import java.util.Scanner;

public class Exercise6 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        VietnamesePhone vnPhone = new VietnamesePhone();
        while (true) {
            System.out.println(" 1. InsertContact. ");
            System.out.println(" 2. RemoveContact. ");
            System.out.println(" 3. UpdateContact. ");
            System.out.println(" 4. SearchContact");
            System.out.println(" 5. ShowContact ");
            System.out.println(" 6. Exit ");
        int menuChoose = sc.nextInt();
        switch (menuChoose) {
            case 1:
                System.out.println("Nhập vào tên Contact: ");
                String name = sc.next();
                System.out.println("Nhập vào tên số Phone: ");
                String phone = sc.next();
                vnPhone.insertContact(name, phone);
                break;
            case 2:
                System.out.println("Nhập vào tên Contact cần remove: ");
                String removeName = sc.next();
                vnPhone.removeContact(removeName);
                break;
            case 3:
                System.out.println("Nhập tên cần Update: ");
                String name1 = sc.next();
                System.out.println("Nhập số Phone mới: ");
                String newPhone = sc.next();
                vnPhone.updateContact(name1, newPhone);
                System.out.println("Kết quả: ");
                vnPhone.searchContact(name1);
                break;
            case 4:
                System.out.println("Nhập vào tên Contact cần tìm kiếm: ");
                String searchName = sc.next();
                vnPhone.searchContact(searchName);
                break;
            case 5:
                vnPhone.printContact();
                break;
            case 6:
                return;
            default:
                System.out.println("Chọn lại");
                break;
        }
        }
    }
}
