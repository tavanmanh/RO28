package com.vti.backend;

public class HighSchoolStudent extends Student2{
    private String clazz;
    private String desiredUniversity;
    public HighSchoolStudent(String name, int id, String clazz, String desiredUniversity) {
        super(name, id);
        this.clazz = clazz;
        this.desiredUniversity = desiredUniversity;
    }

    @Override
    public String toString() {
        return "HighSchoolStudent{" + "id='" + super.getId() + '\'' + "name='" +

                super.getName() + '\'' + "clazz='"

                + clazz + '\'' + ", desiredUniversity='" + desiredUniversity + '\''

                + '}';
    }

    public static void main(String[] args) {
        HighSchoolStudent highSchoolStudent = new HighSchoolStudent("Nam", 1, "Chuyên Văn", "Đại học công nghệ");
        System.out.println(highSchoolStudent);
    }
}
