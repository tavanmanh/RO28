package org.example;

import org.example.Controllers.AccountController;
import org.example.Controllers.DepartmentController;
import org.example.Controllers.PotisionController;
import org.example.entity.Account;
import org.example.entity.Department;
import org.example.entity.Potision;
import org.example.repository.AccountRepsitory;
import org.example.repository.DepartmentRepository;
import org.example.repository.PotisionRepository;
import org.example.service.impl.AccountServiceImpl;
import org.example.service.impl.DepartmentServiceImpl;
import org.example.service.impl.PotisionServiceImpl;
import org.example.util.ScannerUtils;

import javax.swing.text.Position;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        DepartmentRepository repository = new DepartmentRepository();
//        DepartmentServiceImpl service = new DepartmentServiceImpl(repository);
//        DepartmentController controller = new DepartmentController(service);
//        boolean exit = false;
//        do {
//            showMenu();
//            // Lưu chữ sự lựa chọn
//            int choice = ScannerUtils.inputInt();
//            switch (choice) {
//                case 1:
//                    System.out.println("========== Danh sách phòng ban ==========");
//                    List<Department> departments = controller.getListDepartment();
//                    for (Department department : departments) {
//                        System.out.println(department);
//                    }
//                    break;
//
//                case 2:
//                    System.out.print("Mời bạn nhập vào tên phòng bạn: ");
//                    Department requestCreate = new Department();
//                    String departmentName = ScannerUtils.inputString();
//                    requestCreate.setDepartmentName(departmentName);
//                    controller.creteDepartment(requestCreate);
//                    break;
//
//                case 3:
//                    System.out.print("Mời bạn nhập vào ID phòng ban muốn chỉnh sửa: ");
//                    int idUpdate = ScannerUtils.inputInt();
//                    System.out.print("Mời bạn nhập vào tên mới của phòng ban: ");
//                    String newDepartmentName = ScannerUtils.inputString();
//                    Department requestUpdate = new Department();
//                    requestUpdate.setDepartmentId(idUpdate);
//                    requestUpdate.setDepartmentName(newDepartmentName);
//                    controller.updateDepartment(requestUpdate);
//                    break;
//
//                case 4:
//                    System.out.print("Mời bạn nhập vào ID phòng ban muốn xóa: ");
//                    int idDelete = ScannerUtils.inputInt();
//                    Department requestDelete = new Department();
//                    requestDelete.setDepartmentId(idDelete);
//                    controller.deleteDepartment(requestDelete);
//                    break;
//
//                case 5:
//                    exit = true;
//                    break;
//
//                default:
//                    System.out.println("Bạn đã chọn sai chức năng mời bạn chạy lại chương trình và chọn lại các chức năng từ 1 đến 5");
//                    break;
//            }
//        } while (!exit);
//        AccountRepsitory repository = new AccountRepsitory();
//        AccountServiceImpl service = new AccountServiceImpl(repository);
//        AccountController controller = new AccountController(service);
//        boolean exit = false;
//        do {
//            showMenu();
//            // Lưu chữ sự lựa chọn
//            int choice = ScannerUtils.inputInt();
//            switch (choice) {
//                case 1:
//                    System.out.println("========== Danh sách phòng ban ==========");
//                    List<Account> accounts = controller.getListAccount();
//                    for (Account account : accounts) {
//                        System.out.println(account);
//                    }
//                    break;
//                case 4:
//                    System.out.print("Mời bạn nhập vào ID muốn xóa ");
//                    int idDelete = ScannerUtils.inputInt();
//                    Account requestDelete = new Account();
//                    requestDelete.setId(idDelete);
//                    controller.deleteAccount(requestDelete);
//                    break;
//                case 5:
//                    exit = true;
//                    break;
//                default:
//                    System.out.println("Bạn đã chọn sai chức năng mời bạn chạy lại chương trình và chọn lại các chức năng từ 1 đến 5");
//                    break;
//            }
//        } while (!exit);


        PotisionRepository repository = new PotisionRepository();
        PotisionServiceImpl service = new PotisionServiceImpl(repository);
        PotisionController controller = new PotisionController(service);
        boolean exit = false;
        do {
            showMenu();
            // Lưu chữ sự lựa chọn
            int choice = ScannerUtils.inputInt();
            switch (choice) {
                case 1:
                    System.out.println("========== Danh sách chức vụ ==========");
                    List<Potision> potisions = controller.getListPotision();
                    for (Potision potision : potisions) {
                        System.out.println(potision);
                    }
                    break;

                case 2:
                    System.out.print("Mời bạn nhập vào tên chức vụ: ");
                    Potision requestCreate = new Potision();
                    String potisionName = ScannerUtils.inputString();
                    requestCreate.setPotisionName(potisionName);
                    controller.cretePotision(requestCreate);
                    break;

                case 3:
                    System.out.print("Mời bạn nhập vào ID chức vụ muốn chỉnh sửa: ");
                    int idUpdate = ScannerUtils.inputInt();
                    System.out.print("Mời bạn nhập vào tên mới của chức vụ: ");
                    String newPotisionName = ScannerUtils.inputString();
                    Potision requestUpdate = new Potision();
                    requestUpdate.setPotisionId(idUpdate);
                    requestUpdate.setPotisionName(newPotisionName);
                    controller.updatePotision(requestUpdate);
                    break;

                case 4:
                    System.out.print("Mời bạn nhập vào ID chức vụ muốn xóa: ");
                    int idDelete = ScannerUtils.inputInt();
                    Potision requestDelete = new Potision();
                    requestDelete.setPotisionId(idDelete);
                    controller.deletePotision(requestDelete);
                    break;

                case 5:
                    exit = true;
                    break;

                default:
                    System.out.println("Bạn đã chọn sai chức năng mời bạn chạy lại chương trình và chọn lại các chức năng từ 1 đến 5");
                    break;
            }
        } while (!exit);
    }

    public static void showMenu() {
        System.out.println("+---------------------------------------------------+");
        System.out.println("1.Hiển thị danh sách");
        System.out.println("2.Thêm mới ");
        System.out.println("3.Chỉnh sửa thông tin ");
        System.out.println("4.Xoá");
        System.out.println("5.Thoát chương trình");
        System.out.println("+---------------------------------------------------+");
        System.out.print("Hãy nhập vào sự lựa chọn của bạn: ");
    }

    }
