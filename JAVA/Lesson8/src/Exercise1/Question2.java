package Exercise1;

import java.util.*;

public class Question2 {
    public static void main(String[] args) {
        Stack<Student> stackStudent = new Stack<Student>();

        stackStudent.push(new Student("Manh  1"));
        stackStudent.push(new Student("Manh  2"));
        stackStudent.push(new Student("Manh  3"));
        stackStudent.push(new Student("Manh  4"));
        stackStudent.push(new Student("Manh  5"));
        stackStudent.push(new Student("Manh  6"));
        int x=stackStudent.size();
        for (int i = 0; i < x; i++) {
            System.out.println(stackStudent.pop());
        }

        Queue<Student> studentQueue = new LinkedList<>();
        studentQueue.add(new Student("Manh  1"));
        studentQueue.add(new Student("Manh  2"));
        studentQueue.add(new Student("Manh  3"));
        studentQueue.add(new Student("Manh  4"));
        studentQueue.add(new Student("Manh  5"));
        studentQueue.add(new Student("Manh  6"));
        int size = studentQueue.size();
        for (int i = 0; i < size; i++) {
            System.out.println(studentQueue.poll());
        }
    }
}
