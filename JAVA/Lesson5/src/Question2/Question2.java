package Question2;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
    Tuyen_Sinh tuyenSinh = new Tuyen_Sinh();
     Scanner sc=new Scanner(System.in);
    while (true) {
        System.out.println(" 1. Insert Student. ");
        System.out.println(" 2. View Student. ");
        System.out.println(" 3. Find by idNum Student . ");
        System.out.println(" 4. Exit");
        int menuChoose = sc.nextInt();
        switch (menuChoose) {
            case 1:
                tuyenSinh.addContestant();
                break;
            case 2:
                tuyenSinh.showInfoContestant();
                break;
            case 3:
                System.out.println("Nhập vào ID cần tìm kiếm: ");
                int id = sc.nextInt();
                tuyenSinh.findByIdNum(id);
                break;
            case 4:
                return;
            default:
                System.out.println("Nhập lại ");
        }
    }
    }
}
