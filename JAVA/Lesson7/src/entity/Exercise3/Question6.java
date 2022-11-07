package entity.Exercise3;

import entity.Exercise1.Insert;

import java.io.File;
import java.util.ArrayList;

public class Question6 {
    public static String[] getAllFileName(String path){
        File file = new File(path);
        if (file.isDirectory()) {
            return file.list();
        } else {
            System.out.println("Đây không phải là đường dẫn!!");
            return null;
        }
    }

    public static void main(String[] args) {
        String path = Insert.inputString();
        File file = new File(path);
        for (String x:getAllFileName(path)){
                System.out.println(x);
        }

    }
}
