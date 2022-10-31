package com.vti.backend.ThuVien;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Question4 {
    public static ArrayList<TaiLieu> listTaiLieu = new ArrayList<TaiLieu>();
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            System.out.println("Lựa chọn chức năng ");
            System.out.println(" 1. Thêm mới tài liệu. ");
            System.out.println(" 2. Xóa tài liệu. ");
            System.out.println(" 3. Hiện thị thông tin tài liệu. ");
            System.out.println(" 4. Tìm kiếm tài liệu theo loại ");
            System.out.println(" 5. Thoát khỏi chương trình. ");
            int menuChoose = sc.nextInt();
            switch (menuChoose) {
                case 1:
                    ThemTaiLieu();
                    break;
                case 2:
                    XoaTaiLieu();
                    break;
                case 3:
                    InTaiLieu();
                    break;
//                case 4:
//                    LocTaiLieu();
//                    break;
                default:
                    return;
            }
        }
    }
    public static void ThemTaiLieu() {
        System.out.println(" 1. Thêm Sách");
        System.out.println(" 2. Thêm Tạp chí");
        System.out.println(" 3. Thêm Báo");
        int choose1 = sc.nextInt();
        switch (choose1) {
            case 1:
                System.out.println("Nhập vào mã tài liệu ");
                int id = sc.nextInt();
                System.out.println("Nhập vào tên nhà xuất bản: ");
                String TenNXB = sc.next();
                System.out.println("Nhập vào số bản phát hành: ");
                int SoBan = sc.nextInt();
                System.out.println("Nhập vào tên tác giả: ");
                String TacGia = sc.next();
                System.out.println("Nhập vào số trang: ");
                int SoTrang = sc.nextInt();
                TaiLieu sach = new Sach(id, TenNXB, SoBan, TacGia, SoTrang);
                listTaiLieu.add(sach);
                break;
            case 2:
                System.out.println("Nhập vào mã tài liệu ");
                int id1 = sc.nextInt();
                System.out.println("Nhập vào tên nhà xuất bản: ");
                String TenNXB1 = sc.next();
                System.out.println("Nhập vào số bản phát hành: ");
                int SoBan1 = sc.nextInt();
                System.out.println("Nhập vào số phát hành: ");
                int SoPhatHanh = sc.nextInt();
                System.out.println("Nhập vào tháng phát hành: ");
                int ThangPhatHanh = sc.nextInt();
                TaiLieu taptri = new TapTri(id1, TenNXB1, SoBan1, SoPhatHanh, ThangPhatHanh);
                listTaiLieu.add(taptri);
                break;
            case 3:
                System.out.println("Nhập vào mã tài liệu ");
                int id2 = sc.nextInt();
                System.out.println("Nhập vào tên nhà xuất bản: ");
                String TenNXB2 = sc.next();
                System.out.println("Nhập vào số bản phát hành: ");
                int SoBan2 = sc.nextInt();
                System.out.println("Nhập vào ngày phát hành: ");
                int day = sc.nextInt();
                System.out.println("Nhập vào tháng phát hành: ");
                int month = sc.nextInt();
                System.out.println("Nhập vào năm phát hành: ");
                int year = sc.nextInt();
                LocalDate NgayPhatHanh = LocalDate.of(year, month, day);
                TaiLieu bao = new Bao(id2, TenNXB2, SoBan2, NgayPhatHanh);
                listTaiLieu.add(bao);
                break;
        }
    }
    public static void InTaiLieu(){
        for (TaiLieu Tl : listTaiLieu) {
            System.out.println(Tl);
        }

    }
    private static void XoaTaiLieu(){
        System.out.println("Nhập vào mã tài liệu muốn xóa ");
        int xoa = sc.nextInt();
        for (int i = 0; i < listTaiLieu.size(); i++) {
            if(listTaiLieu.get(i)==xoa){
                listTaiLieu.remove(i);
            }
        }
    }
}
