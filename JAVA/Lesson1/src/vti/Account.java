package vti;

import java.time.LocalDate;
import java.util.Date;

public class Account {
    public int id;
    public String email;
    public String Username;
    public String FullName;
    public Department department;

    public Position position;

    public LocalDate createDate;
    public Group[] groups;

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", Username='" + Username + '\'' +
                ", FullName='" + FullName + '\'' +
                ", department=" + department +
                ", position=" + position +
                ", createDate=" + createDate +
                '}';
    }
}
