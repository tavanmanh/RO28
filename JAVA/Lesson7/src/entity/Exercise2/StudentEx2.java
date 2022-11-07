package entity.Exercise2;

public class StudentEx2 {
    private final int id;
    private String name;

    public StudentEx2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public static final void study() {
        System.out.println("Sinh viên đang học bài");
    }
}
