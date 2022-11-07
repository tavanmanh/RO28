package entity.Exercise3;

import entity.Exercise1.Insert;

import java.io.File;

public class Question10 {
    public static void createNewFolder(String newPathFolder) throws Exception {
        File file = new File(newPathFolder);
        if(file.isDirectory()){
            throw new MyException("Đã tồn tại");
        }
        else
        new File(newPathFolder).mkdir();
    }

    public static void main(String[] args) throws Exception {
        String newPath = Insert.inputString();
        createNewFolder(newPath);
    }
}
