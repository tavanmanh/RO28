package entity.Exercise3;

import entity.Exercise1.Insert;

import java.io.File;
import java.nio.file.Files;

public class Question8 {
    public static void moveFile(String sourceFile, String destinationPath) throws Exception {
        String[] s = sourceFile.split("\\\\");
        String nameFile = s[s.length - 1];
        String destinationFile = destinationPath + "\\" + nameFile;
        File source = new File(sourceFile);
        File dest = new File(destinationFile);
        if (source.exists() != true) {
            throw new MyException("Error! SourceFile Not Exist.");
        } else if (dest.exists() == true) {
            throw new MyException("Error!newPath has File same name.");
        }else {
            Files.move(source.toPath(), dest.toPath());
        }

    }
    public static void main(String[] args) throws Exception  {
        String sourceFile = Insert.inputString();
        String newPath = Insert.inputString();
        moveFile(sourceFile,newPath);

    }
}
