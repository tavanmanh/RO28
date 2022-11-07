package entity.Exercise3;

import entity.Exercise1.Insert;

import java.io.File;
import java.nio.file.Files;

public class Question9 {
    public static void renameFile(String pathFile, String newName) throws Exception {
        File source = new File(pathFile);
        File newna = new File(newName);
        if (source.exists() != true) {
            throw new MyException("Error! SourceFile Not Exist.");
        } else if (newna.exists() == true) {
            throw new MyException("Error!Name is Exist.");
        }else {
            source.renameTo(newna);
        }
    }
    public static void main(String[] args) throws Exception {
        String sourceFile = Insert.inputString();
        String newPath = Insert.inputString();
        renameFile(sourceFile,newPath);

    }
}
