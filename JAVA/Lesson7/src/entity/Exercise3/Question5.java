package entity.Exercise3;

import entity.Exercise1.Insert;

import java.io.File;

public class Question5 {
    public static boolean isFolder(String path){
        File f = new File(path);
        if (f.exists()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String path = Insert.inputString();
        File file = new File(path);
        if(isFolder(path)){
            if(file.isDirectory()){
                System.out.println("foleder");
            }
            else if(file.isFile()){
                System.out.println("file");
            }
            else {
                System.out.println("không phải là file,folder");
            }

        }
    }
}
