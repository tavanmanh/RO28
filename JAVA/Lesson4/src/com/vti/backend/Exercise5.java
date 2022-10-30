package com.vti.backend;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise5 {
    public static ArrayList<CanBo> listCanBo = new ArrayList<CanBo>();
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            System.out.println("Lựa chọn chức năng bạn muốn sử dụng");
            System.out.println("=== 1. Thêm mới cán bộ. ===");
            System.out.println("=== 2. Tìm kiếm theo họ tên. ===");
            System.out.println("=== 3. Hiện thị thông tin về danh sách các cán bộ. ===");
            System.out.println("=== 4. Nhập vào tên của cán bộ và delete cán bộ đó ===");
            System.out.println("=== 5. Thoát khỏi chương trình. ===");
            int menuChoose = sc.nextInt();
            switch (menuChoose) {
                case 1:
                    addStaff();
                    break;
                case 2:
                    findByName();
                    break;
                case 3:
                    printListStaff();
                    break;
                case 4:
                    deleteByName();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Lựa chọn đúng số trên menu");
                    break;
            }
        }
    }
    private static void addStaff(){
        System.out.println("Nhập vào tên");
        String name= sc.next();
        System.out.println("Nhập vào tuổi");
        int age = sc.nextInt();
        System.out.println("Nhập vào Giới tính");
        String gender= sc.next();
        System.out.println("Nhập vào địa chỉ");
        String address= sc.next();
        CanBo cb= new CanBo(name,age,gender,address);
        listCanBo.add(cb);
    }
    private static void findByName(){
        System.out.println("Nhập vào tên muốn tìm kiếm: ");
        String findName = sc.next();
        for (CanBo cb : listCanBo) {
            if ((cb.getName()).equals(findName)) {
                System.out.println(cb);
            }
        }
    }
    private static void printListStaff() {
        for (CanBo cb : listCanBo) {
            System.out.println(cb);
        }
    }
    private static void deleteByName(){
        System.out.println("Nhập vào tên muốn xóa: ");
        String xoa = sc.next();
        for (int i = 0; i < listCanBo.size(); i++) {
           if(listCanBo.get(i).getName().equals(xoa)){
               listCanBo.remove(i);
           }
        }
    }
}
