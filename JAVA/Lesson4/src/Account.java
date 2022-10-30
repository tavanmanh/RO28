import java.time.LocalDate;
import java.util.Date;

public class Account {
    public int id;
    public String email;
    public String Username;
    public String FullName;
    public Department department;
    public LocalDate createDate;
    public Position position;

    public Account() {
    }

    public Account(int id, String email, String userName, String fullName) {
        this.id = id;
        this.email = email;
        this.Username = userName;
        this.FullName = fullName;
    }

    public Account(int id, String email, String userName, String fullName, Position position) {

        this.id = id;
        this.email = email;
        this.Username = userName;
        this.FullName = fullName;
        this.position = position;
        this.createDate = LocalDate.now();
    }

    public Account(int id, String email, String userName, String fullName, Position position, LocalDate createDate) {
        this.id = id;
        this.email = email;
        this.Username = userName;
        this.FullName = fullName;
        this.position = position;
        this.createDate = createDate;
    }

    public static void main(String[] args) {
        Account acc1 = new Account();
        Account acc2 = new Account(2, "email2", "username2", "fullname2");
        Position pos = new Position();
        Account acc3 = new Account(3, "email3", "username3", "fullname3", pos);
        Account acc4 = new Account(3, "email3", "username3", "fullname3", pos, LocalDate.of(2021, 03, 17));
        System.out.println(acc4.email);
    }
}
