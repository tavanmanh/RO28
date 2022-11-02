package Exercise2.Question1;

public class Student implements IStudent{
    public static int COUNT=0;
    private int id;
    private String name;
    private int group;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", group=" + group +
                '}';
    }

    @Override
    public void diemDanh() {
        System.out.println(name + " điểm danh.");
    }

    @Override
    public void hocBai() {
        System.out.println(name + " học bài");
    }

    @Override
    public void donVeSinh() {
        System.out.println(name + " đi dọn vệ sinh.");
    }

    public Student() {
    }

    public Student(String name, int group) {
        COUNT++;
        this.id = COUNT;
        this.name = name;
        this.group = group;
    }
}
