package entity.Exercise3;

import entity.Exercise1.Insert;

import java.io.File;
import java.io.IOException;

public class Question2 {
    public static void main(String[] args) {
        try {
            String path = Insert.inputString();
            File file = new File(path);

            if (file.createNewFile()) {
                System.out.println("File is created!");
            } else {
                System.out.println("File already exists.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
