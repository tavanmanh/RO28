package entity.Exercise4;

import entity.Exercise1.Insert;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Q1 {
    public static void writeObject(Object object, String path, String fileName) throws Exception {

//        if (!FileUltis.isFileExists(path)) {
//            throw new Exception(FILE_NOT_EXIST);
//        }
        System.out.print("File name:");
        fileName = Insert.inputString();
        path = path + "\\" + fileName;
        FileOutputStream out = new FileOutputStream(path);
        ObjectOutputStream objectOut = new ObjectOutputStream(out);
        objectOut.writeObject(object);
        out.close();
        objectOut.close();
        System.out.println("WRITE_FILE_SUCCESS");
    }
}
