package Exercise1;

import java.util.*;

public class Question6 {
    public static void main(String[] args) {
        Map<Integer, String> studentMap = new HashMap<Integer, String>();
        studentMap.put(1,"manh");
        studentMap.put(2,"anh");
        studentMap.put(3,"ba");
        studentMap.put(4,"em");
        studentMap.put(5,"gai");
        studentMap.put(6,"danh");
        Set set = studentMap.keySet();
        for (Object mapStudent : set) {
            System.out.println(mapStudent + " " + studentMap.get(mapStudent));
        }

        List<Student> listSt = new ArrayList<Student>();
        for (Object mapStudent : set) {
            String name=studentMap.get(mapStudent);
            Student st= new Student(name);
            listSt.add(st);
            System.out.println(st);
        }
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
