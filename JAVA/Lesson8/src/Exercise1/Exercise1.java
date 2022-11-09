package Exercise1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        List<Student> listStudent = new ArrayList<>();
        System.out.println("Nhập số sinh viên muốn thêm: ");
        listStudent.add(new Student("Manh  1"));
        listStudent.add(new Student("Manh  2"));
        listStudent.add(new Student("Manh  3"));
        listStudent.add(new Student("Manh  4"));
        listStudent.add(new Student("Manh  5"));
        listStudent.add(new Student("Manh  6"));

        Collections.reverse(listStudent);
        System.out.println("Đã đảo ngược vị trí ");
        System.out.println(listStudent.get(4));
        System.out.println(listStudent.get(0));


        System.out.println(listStudent.size());
        System.out.println(listStudent.get(3));
        System.out.println(listStudent.get(listStudent.size()-1));
        listStudent.add(0,new Student("Manh  0"));
        System.out.println(listStudent.get(0));
        listStudent.add(new Student("Manh"+(listStudent.size()-1)));
        System.out.println(listStudent.get(listStudent.size()-1));

        System.out.println("Nhập vào id cần tìm kiếm:");
        int id = sc.nextInt();
        for (Student student : listStudent) {
            if (student.getId()==id) {
                System.out.println(student);
            }
        }


        System.out.println("Nhập vào name cần tìm kiếm:");
        String name = sc.next();
        for (Student student : listStudent) {
            if (student.getName().equals(name)) {
                System.out.println(student);
            }
        }
        //xoa name co id=2
        for (Student student : listStudent) {
            if (student.getId()==2) {
                student.setName("");
            }
        }
        //xoa student co id =5
        for (Student student : listStudent) {
            if (student.getId()==5) {
                listStudent.remove(student);
            }
        }
        //add all
        List<Student> arrayCopy = new ArrayList<Student>();
        arrayCopy.addAll(listStudent);


    }
}
