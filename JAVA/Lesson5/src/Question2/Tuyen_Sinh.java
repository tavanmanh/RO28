package Question2;

import java.util.ArrayList;
import java.util.Scanner;

public class Tuyen_Sinh implements ItuyenSinh{
    private ArrayList<Student> listStudent = new ArrayList<Student>(); ;
    private Scanner sc=new Scanner(System.in);
    @Override
    public void addContestant() {
        System.out.println("Nhập vào tên thí sinh:");
        String name = sc.next();
        System.out.println("Nhập vào địa chỉ thí sinh:");
        String address = sc.next();
        System.out.println("Nhập vào mức ưu tiên thí sinh:");
        int priority = sc.nextInt();
        System.out.println("Nhập vào khối thí sinh chọn các khối A, B, C: ");
        String block = sc.next();
        Student contestant = new Student(name, address, priority,new Block(block));
        listStudent.add(contestant);
    }
    @Override
    public void showInfoContestant() {
        for (Student students : listStudent) {
            System.out.println(students);
        }
    }
    @Override
    public void findByIdNum(int id) {
        for (Student students : listStudent) {
            if (students.getIdNum() == id) {
                System.out.println(students);
            }
        }
    }
}
