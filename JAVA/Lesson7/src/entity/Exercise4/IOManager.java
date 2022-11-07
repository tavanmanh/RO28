package entity.Exercise4;

import entity.Exercise1.Insert;
import entity.Exercise3.MyException;

import java.io.*;
import java.util.Scanner;

public class IOManager {
    public static void readFile(String name) throws Exception {
        File f = new File(name);
        if (f.exists()) {
            Scanner myReader = new Scanner(f);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        }
        else {
            throw new MyException("File không tồn tại");
        }
    }
    public static void writeFile(String name,String str,boolean isContinuing) throws Exception {
        File f = new File(name);
        if (f.exists()) {
            if(isContinuing == false) {
                FileWriter myWriter = new FileWriter(name);
                myWriter.write(str);
                myWriter.close();
            }
            else {
                FileWriter fw = new FileWriter(f,true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw);
                pw.println(str);
                pw.close();
            }
            System.out.println("Ghi file thành công.");
        }
        else {
            throw new MyException("File không tồn tại");
        }
    }

    public static void writeObject(Object object, String path, String fileName) throws Exception {
        File f = new File(path);
        if (f.exists() == false){
            new File(path).mkdir();
        }
        if(object != null){
        System.out.print("File name:");
        path = path + "\\" + fileName;
        FileOutputStream out = new FileOutputStream(path);
        ObjectOutputStream objectOut = new ObjectOutputStream(out);
        objectOut.writeObject(object);
        out.close();
        objectOut.close();
        System.out.println("Ghi thành công");
        }
        else {
            throw new MyException("object không tồn tại ");
        }
    }

    public static Object readObject(String filePath) throws Exception {
        File f = new File(filePath);
        if (f.exists()== false) {
            throw new MyException("file không tồn tại ");
        }
        else {
            FileInputStream fileIn = new FileInputStream(filePath);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            Object obj = objectIn.readObject();
            System.out.println("The Object has been read from the file");
            objectIn.close();
            return obj;
        }
    }
}
