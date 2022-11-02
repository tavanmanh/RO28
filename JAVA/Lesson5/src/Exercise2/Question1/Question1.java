package Exercise2.Question1;

import java.util.ArrayList;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
         ArrayList<Student> listStudent=new ArrayList<Student>();
         Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println(" 1. Tạo danh sách sinh viên. ");
            System.out.println(" 2. Hiển thị ds sv trong lớp. ");
            System.out.println(" 3. Điểm danh lớp ");
            System.out.println(" 4. Gọi nhóm 1 đi học bài ");
            System.out.println(" 5. Gọi nhóm 2 đi dọn vệ sinh ");
            System.out.println(" 6. Thoát. ");
            int menuChoose = sc.nextInt();
            switch (menuChoose) {
                case 1:
                    System.out.println("Nhập vào Tên");
                    String name = sc.next();
                    System.out.println("Nhập vào Gr");
                    int gr = sc.nextInt();
                    Student st= new Student(name,gr);
                    listStudent.add(st);
                    break;
                case 2:
                    for (Student student : listStudent) {
                        System.out.println(student);
                    }
                    break;
                case 3:
                    System.out.println("Cả lớp điểm danh: ");
                    for (Student student : listStudent) {
                        student.diemDanh();
                    }
                    break;
                case 4:
                    System.out.println("Nhóm 1 đi học bài: ");
                    for (Student student : listStudent) {
                        if (student.getGroup() == 1) {
                            student.hocBai();
                        }
                    }
                    break;
                case 5:
                    System.out.println("Nhóm 2 đi dọn vệ sinh: ");
                    for (Student student : listStudent) {
                        if (student.getGroup() == 2) {
                            student.donVeSinh();
                        }
                    }
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Chon lại");

                    break;
            }
        }
    }
}
