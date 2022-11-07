package entity.Exercise3;

import entity.Exercise1.HinhHocException;
import entity.Exercise1.Insert;

import java.io.*;
import java.nio.file.Files;

public class Question7 {
    public static void copyFile(String sourceFile, String newPath) throws Exception{
            String[] s = sourceFile.split("\\\\");
            String nameFile = s[s.length - 1];
            String destinationFile = newPath + "\\" + nameFile;
            File source = new File(sourceFile);
            File dest = new File(destinationFile);
            if (source.exists() != true) {
                throw new MyException("Error! SourceFile Not Exist.");
            } else if (dest.exists() == true) {
                throw new MyException("Error!newPath has File same name.");
            }else {
                Files.copy(source.toPath(), dest.toPath());
            }

    }

    public static void main(String[] args) throws Exception  {
        String sourceFile = Insert.inputString();
        String newPath = Insert.inputString();
        copyFile(sourceFile,newPath);

    }
}
