package vti;

import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;
import java.text.NumberFormat;

public class Exercise2 {
    public static void main(String[] args) {
        //Question 1
        int i = 5;
        System.out.printf("%d%n", i);

        //Question 2
        NumberFormat numberFormatDefault = NumberFormat.getInstance();
        int i1 = 100000000;
        System.out.printf(numberFormatDefault.format(i1)+"%n");

        //Question 3
        float c = 5.567098f;
        System.out.printf("%.4f%n", c);

        //Question 4
        String s = "Nguyễn Văn A";
        System.out.printf("Tên tôi là " + s + "và tôi đang độc thân \n");

        //Question 5
        String pattern = "dd/MM/yyyy HH:mm:ss";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        System.out.println(date);

        //Question 6

        Department dep1 = new Department();
        dep1.id = 1;
        dep1.DepartmentName = "IT";
        Department dep2 = new Department();
        dep2.id = 2;
        dep2.DepartmentName = "Dev";
        Department dep3 = new Department();
        dep3.id = 3;
        dep3.DepartmentName = "MKT";

        Position pos1 = new Position();
        pos1.id = 1;
        pos1.PoName = Position.PositionName.Dev;
        Position pos2 = new Position();
        pos2.id = 2;
        pos2.PoName = Position.PositionName.PM;
        Position pos3 = new Position();
        pos3.id = 3;
        pos3.PoName = Position.PositionName.Scrum_Master;

        Group gr1 = new Group();
        gr1.id = 1;
        gr1.groupName = "MKT";
        Group gr2 = new Group();
        gr2.id = 2;
        gr2.groupName = "IT";
        Group gr3 = new Group();
        gr3.id = 3;
        gr3.groupName = "Sale";

        Account acc1 = new Account();
        acc1.id = 1;
        acc1.email = "MANH";
        acc1.Username = "MANH";
        acc1.FullName = "TA VAN MANH";
        acc1.department = dep1;
        acc1.position = pos1;
        acc1.createDate = LocalDate.of(2021, 03, 17);
        Group[] groupAcc1 = {gr1, gr3};
        acc1.groups = groupAcc1;

        Account acc2 = new Account();
        acc2.id = 2;
        acc2.email = "KHA";
        acc2.Username = "KHA";
        acc2.FullName = "TA VAN KHA";
        acc2.department = dep2;
        acc2.position = pos1;
        acc2.createDate = LocalDate.of(2021, 03, 17);
        Group[] groupAcc2 = {gr2, gr3};
        acc1.groups = groupAcc2;

        Account acc3 = new Account();
        acc3.id = 3;
        acc3.email = "NGA";
        acc3.Username = "NGA";
        acc3.FullName = "NGUEY THI NGA";
        acc3.department = dep3;
        acc3.position = pos3;
        acc3.createDate = LocalDate.of(2021, 03, 17);

        gr1.accounts = new Account[]{acc1};
        gr2.accounts = new Account[]{acc1, acc2};
        gr3.accounts = new Account[]{acc2};

        System.out.printf("%15s","AccountID");
        System.out.printf("%15s", "Email");
        System.out.printf("%15s%n", "Name");
        Account[] AccArray1 = {acc1, acc2, acc3};
        for (Account acc : AccArray1) {
            System.out.printf("%15s", acc.id);
            System.out.printf("%15s", acc.email);
            System.out.printf("%20s%n", acc.FullName);
        }
    }
}
