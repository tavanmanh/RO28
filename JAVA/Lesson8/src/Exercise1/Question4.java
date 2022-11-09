package Exercise1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Question4 {
    public static void main(String[] args) {
    Set<Student> studentSet = new HashSet<Student>();
        studentSet.add(new Student("Manh  1"));
        studentSet.add(new Student("Manh  2"));
        studentSet.add(new Student("Manh  3"));
        studentSet.add(new Student("Manh  4"));
        studentSet.add(new Student("Manh  5"));
        studentSet.add(new Student("Manh  6"));
        Iterator<Student> i1 = studentSet.iterator();
        for (int i = 0; i < studentSet.size(); i++) {
            System.out.println(i1.next());
        }
    }

}
