package entity.Exercise5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Question1 {
    public static void main(String[] args) {
        Student st1= new Student(1,"manh");
        Student st2= new Student(2,"chi");
        Student st3= new Student(3,"kha");
        Student [] arr={st1,st2,st3};
        try {
            FileOutputStream fo = new FileOutputStream("StudentInformation.txt");
            ObjectOutputStream oos= new ObjectOutputStream(fo);
            oos.writeObject(arr);
            oos.flush();
            oos.close();
            fo.close();
            FileInputStream fi= new FileInputStream("StudentInformation.txt");
            ObjectInputStream ois= new ObjectInputStream(fi);
            Student[] st= (Student[]) ois.readObject();
            for(int i=0;i<st.length;i++) {
                System.out.println(st[i]);
            }
            ois.close();
            fi.close();
        }catch (Exception e){

        }
    }
}
