package Exercise1;

import java.util.*;

public class Question5 {
    public static void main(String[] args) {

        Set<Student> studentSet = new HashSet<Student>();
        studentSet.add(new Student("manh"));
        studentSet.add(new Student("anh"));
        studentSet.add(new Student("ba"));
        studentSet.add(new Student("em"));
        studentSet.add(new Student("gai"));
        studentSet.add(new Student("danh"));
        List<Student> listSt = new ArrayList<Student>(studentSet);

        Collections.sort(listSt, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        for (Student x : listSt) {
            System.out.println(x);
        }
    }
}
