package entity.Exercise1;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise1 {
    public static Scanner sc = new Scanner(System.in);

    public void question2() {
        System.out.println("Các sinh viên nộp quỹ, mỗi bạn 100K: ");
        System.out.println("Tổng quỹ: " + (Student.moneyGroup = Student.moneyGroup + 300));
        System.out.println("Student thứ 1 lấy 50k đi mua bim bim, kẹo về liên hoan: ");
        System.out.println("Tổng quỹ: " + (Student.moneyGroup -= 50));
        System.out.println("Student thứ 2 lấy 20k đi mua bánh mì: ");
        System.out.println("Tổng quỹ: " + (Student.moneyGroup -= 20));
        System.out.println("Student thứ 3 lấy 150k đi mua đồ dùng học tập cho nhóm: ");
        System.out.println("Tổng quỹ: " + (Student.moneyGroup -= 150));
        System.out.println("Cả nhóm mỗi người lại đóng quỹ mỗi người 50k: ");
        System.out.println("Tổng quỹ: " + (Student.moneyGroup += 150));
    }

    public static void main(String[] args) {
        //Question 1
        ArrayList<Student> arrStudent = new ArrayList<Student>();
        System.out.println("Số sinh viên muốn thêm");
        while (true) {
            try {
                int sl = Integer.parseInt(sc.next());
                if (sl < 7 && sl > 0) {
                    for (int i = 0; i < sl; i++) {
                        Student st = new Student();
                        arrStudent.add(st);
                    }
                    for (Student st : arrStudent) {
                        System.out.println(st);
                    }
                } else {
                    System.err.println("Nhập lại số <=7 và >0");
                }
            } catch (Exception e) {
                System.err.println("Nhập lại:");
            }
        }
        //Question 2
//        Exercise1 ex1 = new Exercise1();
//        ex1.question2();
    }
}
