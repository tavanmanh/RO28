package Exercise2.Question2;

import java.time.LocalDate;
import java.util.Scanner;

public class Person {
    private String name;
    private String gender;
    private LocalDate birthDate;
    private String address;

    public Person() {
    }

    public Person(String name, String gender, LocalDate birthDate, String address) {
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.address = address;
    }

    public String showInfo() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", birthDate=" + birthDate +
                ", address='" + address + '\'' +
                '}';
    }

    public void inputInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập thông tin Person từ bàn phím: ");
        System.out.println("Name: ");
        this.name = sc.next();
        System.out.println("Giới tính");
        this.gender = sc.next();
        System.out.println("Address: ");
        this.address = sc.next();
        System.out.println("Nhập vào ngày sinh ");
        int day = sc.nextInt();
        System.out.println("Nhập vào tháng sinh ");
        int month = sc.nextInt();
        System.out.println("Nhập vào năm sinh");
        int year = sc.nextInt();
        this.birthDate = LocalDate.of(year, month,year);
    }
}
