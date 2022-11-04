package Exercise2;

public class Department {
    public static int COUNT;
    private int id;
    private String name;
    public Department(String name) {
        super();
        COUNT++;
        this.id = COUNT;
        this.name = name;
    }
    public Department() {
        super();
        COUNT++;
        this.id = COUNT;
        System.out.println("Nhập tên phòng: ");
        this.name = ScannerUltis.inputString();
    }
    @Override
    public String toString() {
        return "Department [id=" + id + ", name=" + name + "]";
    }

}
