package entity.Exercise3;

import entity.Exercise1.Insert;

import java.io.File;

public class Question1 {
    public static void main(String args[]) {
        String path = Insert.inputString();
        File f = new File(path);
        if (f.exists()) {
            System.out.println("Tồn tại");
        } else {
            System.out.println("Không tồn tai");
        }
    }
}
