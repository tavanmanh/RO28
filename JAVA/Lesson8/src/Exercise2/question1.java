package Exercise2;

import Exercise1.Student;

import java.time.LocalDate;
import java.util.*;

public class question1 {
    public static void main(String[] args) {
        ArrayList<StudentEx2> listST = new ArrayList<StudentEx2>();
        listST.add(new StudentEx2("manh", LocalDate.of(2000, 5, 20),100));
        listST.add(new StudentEx2("anh",LocalDate.of(2000, 5, 20),200));
        listST.add(new StudentEx2("nh",LocalDate.of(2000, 5, 20),300));
        listST.add(new StudentEx2("h",LocalDate.of(2000, 5, 20),400));
        listST.add(new StudentEx2("ah",LocalDate.of(2000, 5, 20),500));
        listST.add(new StudentEx2("man",LocalDate.of(2000, 5, 20),350));
        Collections.sort(listST, new Comparator<StudentEx2>() {
            @Override
            public int compare(StudentEx2 o1, StudentEx2 o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        for (StudentEx2 x : listST) {
            System.out.println(x);
        }
        Collections.sort(listST, new Comparator<StudentEx2>() {
            @Override
            public int compare(StudentEx2 o1, StudentEx2 o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }
}
