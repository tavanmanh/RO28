package Exercise1;

import java.util.HashSet;
import java.util.Set;

public class Question3 {
    public static void main(String[] args) {
        Set<Student> studentSet = new HashSet<Student>();
        studentSet.add(new Student("Manh  1"));
        studentSet.add(new Student("Manh  2"));
        studentSet.add(new Student("Manh  3"));
        studentSet.add(new Student("Manh  4"));
        studentSet.add(new Student("Manh  5"));
        studentSet.add(new Student("Manh  6"));

        System.out.println("Số phần tử: " + studentSet.size());
        System.out.println("Các phần tử : " + studentSet);

    }
}
