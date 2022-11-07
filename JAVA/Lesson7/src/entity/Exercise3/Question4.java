package entity.Exercise3;

import entity.Exercise1.Insert;

import java.io.File;

public class Question4 {
    public static void main(String[] args) {
        try {
            String path = Insert.inputString();
            File file = new File(path);
            if (file.delete()) {
                System.out.println(file.getName() + " đã xóa");
            } else {
                System.out.println("lỗi.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
