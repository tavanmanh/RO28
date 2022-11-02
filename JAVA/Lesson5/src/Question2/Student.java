package Question2;

public class Student {
    public static int COUNT = 0;
    private int idNum;
    private String name;
    private String address;
    private int priority;
    private Block block;

    public int getIdNum() {
        return idNum;
    }

    public Student() {
    }
    public Student(String name, String address, int priority, Block block)
    {
        COUNT++;
        this.idNum = COUNT;
        this.name = name;
        this.address = address;
        this.priority = priority;
        this.block = block;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idNum=" + idNum +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", priority=" + priority +
                ", bloc name=" + block.getName() +
                ", bloc Subject=" + block.getSubject() +
                '}';
    }
}
