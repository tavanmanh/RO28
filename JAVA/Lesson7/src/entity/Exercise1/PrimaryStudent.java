package entity.Exercise1;

public class PrimaryStudent extends Student{
    public static int COUNT = 0;
    public PrimaryStudent() {
        super();
        COUNT++;
    }
}
