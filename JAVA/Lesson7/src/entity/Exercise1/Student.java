package entity.Exercise1;

public class Student {
    private int id;
    private String name;
    public static String colllect = "Đại học Bách Khoa";
    private static int COUNT = 0;
    static int moneyGroup = 0;

    public static int getCOUNT() {
        return COUNT;
    }

    public Student() {
        COUNT++;
        this.id = COUNT;
        System.out.println("Nhập vào tên sinh viên: ");
        this.name = Insert.inputString();
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", colllect='" + colllect + '\'' +
                '}';
    }

    public static String getColllect() {
        return colllect;
    }

    public static void setColllect(String colllect) {
        Student.colllect = colllect;
    }
}
