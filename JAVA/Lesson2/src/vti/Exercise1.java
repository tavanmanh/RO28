package vti;
import vti.Lesson1;

import java.time.LocalDate;

public class Exercise1 {
    public static void main(String[] args) {

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
        //Question 1
        if (acc2.department == null) {
            System.out.println("Nhân viên này chưa có phòng ban.");
        } else {
            System.out.println("Phòng ban của nv này là: " + acc2.department.DepartmentName);
        }

        //Question 2
        if (acc2.groups == null) {
            System.out.println("Nhân viên này chưa có group");
        } else {
            int SL = acc2.groups.length;
            if (SL == 1 || SL == 2) {
                System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
            }
            if (SL == 3) {
                System.out.println("Nhân viên này là người quan  trọng, tham gia nhiều group");
            }
            if (SL >= 4) {
                System.out.println("Nhân viên này là người hóng  chuyện, tham gia tất cả các group");
            }
        }

        //Question 3

        System.out.println(acc2.department == null ? "Nhân viên này chưa  có phòng ban."
                : "Phòng của nhân viên này là: " + acc2.department.DepartmentName);

        //Question 4
        System.out.println(acc1.position.PoName.toString() == "Dev" ? "Đây là DEV"
                : "Đây không phải Dev");

        //Question 5
        if (gr1.accounts == null) {
            System.out.println("Group chưa có thành viên nào tham gia");
        } else {
            switch (gr1.accounts.length) {
                case 1:
                    System.out.println("Nhóm có một thành viên");
                    break;
                case 2:
                    System.out.println("Nhóm có hai thành viên");
                    break;
                case 3:
                    System.out.println("Nhóm có ba thành viên");
                    break;
                default:
                    System.out.println("Nhóm có nhiều thành viên");
                    break;
            }
        }

        //Question 6
        if (acc2.groups == null) {
            System.out.println("Nhân viên này chưa có group");
        } else {
            switch (acc2.groups.length) {
                case 1:
                    System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
                    break;
                case 2:
                    System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
                    break;
                case 3:
                    System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
                    break;
                default:
                    System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
                    break;
            }
        }

        //Question 7
        switch (acc1.position.PoName.toString()) {
            case "Dev":
                System.out.println("Đây là Developer");
                break;
            default:
                System.out.println("Đây không phải Dev");
                break;
        }

        //Question 8
        Account[] AccArray1 = {acc1, acc2, acc3};
        for (Account acc : AccArray1) {
            System.out.println("AccountID: " + acc.id + " Email: " +
                    acc.email + " Name: " + acc.FullName);
        }

        //Question 9

        Department[] depArray = {dep1, dep2, dep3};
        for (Department dep : depArray) {
            System.out.println("DepID: " + dep.id + " Name: " + dep.DepartmentName);
        }

        //Question 10
        Account[] accArray2 = {acc1, acc2};
        for (int i = 0; i < accArray2.length; i++) {
            System.out.println("Thông tin Acc thứ " + (i + 1) + " là:");
            System.out.println("Email: " + accArray2[i].email);
            System.out.println("Full name: " + accArray2[i].FullName);
            System.out.println("Phòng ban: " + accArray2[i].department.DepartmentName);
        }

        //Question 11
        Department[] depArray1 = {dep1, dep2, dep3};
        for (int i = 0; i < depArray.length; i++) {
            System.out.println("Thông tin department thứ " + (i + 1) + " là:");
            System.out.println("Id: " + depArray1[i].id);
            System.out.println("Name: " + depArray1[i].DepartmentName);
        }

        //Question 12
        Department[] depArray2 = {dep1, dep2, dep3};
        for (int i = 0; i < 2; i++) {
            System.out.println("Thông tin department thứ " + (i + 1) + " là:");
            System.out.println("Id: " + depArray2[i].id);
            System.out.println("Name: " + depArray2[i].DepartmentName);
        }

        //Question 13
        System.out.println("Question 13");
        Account[] AccArray3 = new Account[]{acc1, acc2, acc3};
        for (int i = 0; i < AccArray3.length; i++) {
            if (i != 1) {
                System.out.println("Thông tin Acc thứ " + (i + 1) + " là:");
                System.out.println("Email: " + AccArray3[i].email);
                System.out.println("Full name: " + AccArray3[i].FullName);
                System.out.println("Phòng ban: " + AccArray3[i].department.DepartmentName);
            }
        }

        //Question 14
        Account[] AccArray4 = new Account[]{acc1, acc2, acc3};
        for (int i = 0; i < 3; i++) {
            if (AccArray4[i].id < 4) {
                System.out.println("Thông tin Acc thứ " + (i + 1) + " là:");
                System.out.println("Email: " + AccArray4[i].email);
                System.out.println("Full name: " + AccArray4[i].FullName);
                System.out.println("Phòng ban: " + AccArray4[i].department.DepartmentName);
            }
        }

        //Question 15
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + ",");
            }
        }



//
//        //Question 16-10
//        Account[] accArray1 = { acc1, acc2, acc3 };
//        int i = 0;
//        while (i < accArray1.length) {
//            System.out.println("Thông tin account thứ " + (i + 1) + " là:");
//            System.out.println("Email: " + accArray1[i].email);
//            System.out.println("Full name: " + accArray1[i].FullName);
//            System.out.println("Phòng ban: " +
//                    accArray1[i].department.DepartmentName);
//            i++;
//        }
//
//        //Question 16-11
//        Department[] depArray1 ={ dep1, dep2, dep3 };
//        int i = 0;
//        while (i < accArray1.length) {
//            System.out.println("Thông tin department thứ " + (i + 1) + " là:");
//            System.out.println("Id: " + depArray1[i].id);
//            System.out.println("Name: " + depArray1[i].DepartmentName);
//            i++;
//        }
//
//        //Question 16-12
//        Department[] depArray1 ={ dep1, dep2, dep3 };
//        int i = 0;
//        while (i < 2) {
//            System.out.println("Thông tin department thứ " + (i + 1) + " là:");
//            System.out.println("Id: " + depArray1[i].id);
//            System.out.println("Name: " + depArray1[i].DepartmentName);
//            i++;
//        }
//
//        //Question 16-13
//        Account[] accArray1 = { acc1, acc2, acc3 };
//        int i = 0;
//        while (i < accArray1.length) {
//            if (i == 1) {
//                i++;
//                continue;
//            }
//            System.out.println("Thông tin account thứ " + (i + 1) + " là:");
//            System.out.println("Email: " + accArray1[i].email);
//            System.out.println("Full name: " + accArray1[i].FullName);
//            System.out.println("Phòng ban: " + accArray1[i].department.DepartmentName);
//           i++;
//        }
//
//        //Question 16-14
//
//        Account[] accArray1 = { acc1, acc2, acc3 };
//        int i = 0;
//        while (i < accArray1.length) {
//            if (accArray1[i].id < 4) {
//                System.out.println("Thông tin account thứ " + (i + 1) + " là:");
//                System.out.println("Email: " + accArray1[i].email);
//                System.out.println("Full name: " + accArray1[i].FullName);
//                System.out.println("Phòng ban: " + accArray1[i].department.DepartmentName);
//                i++;
//            }
//        }
//
//        //Question 16-15
//        int i = 0;
//        while (i <= 20) {
//            System.out.print(i+ ",");
//            i=i+2;
//        }
//
//
//        //Question 17-10
//        Account[] accArray1 = { acc1, acc2, acc3 };
//        int i = 0;
//        do{
//            System.out.println("Thông tin account thứ " + (i + 1) + " là:");
//            System.out.println("Email: " + accArray1[i].email);
//            System.out.println("Full name: " + accArray1[i].FullName);
//            System.out.println("Phòng ban: " +
//                    accArray1[i].department.DepartmentName);
//            i++;
//        }while (i < accArray1.length);
//
//        //Question 17-11
//        Department[] depArray1 ={ dep1, dep2, dep3 };
//        int i = 0;
//        do{
//            System.out.println("Thông tin department thứ " + (i + 1) + " là:");
//            System.out.println("Id: " + depArray1[i].id);
//            System.out.println("Name: " + depArray1[i].DepartmentName);
//            i++;
//        }while (i < accArray1.length);
//
//        //Question 17-12
//        Department[] depArray1 ={ dep1, dep2, dep3 };
//        int i = 0;
//       do{
//            System.out.println("Thông tin department thứ " + (i + 1) + " là:");
//            System.out.println("Id: " + depArray1[i].id);
//            System.out.println("Name: " + depArray1[i].DepartmentName);
//            i++;
//        } while (i < 2);
//
//
//        //Question 17-13
//        Account[] accArray1 = { acc1, acc2, acc3 };
//        int i = 0;
//       do{
//            if (i == 1) {
//                i++;
//                continue;
//            }
//            System.out.println("Thông tin account thứ " + (i + 1) + " là:");
//            System.out.println("Email: " + accArray1[i].email);
//            System.out.println("Full name: " + accArray1[i].FullName);
//            System.out.println("Phòng ban: " + accArray1[i].department.DepartmentName);
//            i++;
//        } while (i < accArray1.length);
//
//        //Question 17-14
//        Account[] accArray1 = { acc1, acc2, acc3 };
//        int i = 0;
//       do {
//            if (accArray1[i].id < 4) {
//                System.out.println("Thông tin account thứ " + (i + 1) + " là:");
//                System.out.println("Email: " + accArray1[i].email);
//                System.out.println("Full name: " + accArray1[i].FullName);
//                System.out.println("Phòng ban: " + accArray1[i].department.DepartmentName);
//                i++;
//            }
//        } while (i < accArray1.length);
//
//        //Question 17-15
//        int i = 0;
//       do{
//            System.out.print(i+ ",");
//            i=i+2;
//        } while (i <= 20);
//
    }
}
