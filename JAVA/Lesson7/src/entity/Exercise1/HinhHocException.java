package entity.Exercise1;

public class HinhHocException extends Exception {
    public HinhHocException() {
        System.out.println("Số lượng hình đã tạo vượt quá số lượng cho phép là: " + Config.SO_LUONG_HINH_TOI_DA + " hãy kiểm tra lại.");
    }
}
