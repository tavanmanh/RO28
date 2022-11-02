package Exercise2.Question5;

public abstract class DienThoaiDiDong implements VuKhi {
    public void nghe() {
        System.out.println("Nghe");
    }
    public void goi() {
        System.out.println("Gọi");
    }
    public void guiTinNhan() {
        System.out.println("Gửi tin nhắn");
    }
    public void nhanTinNhan() {
        System.out.println("Nhan tin nhắn");
    }
    @Override
    public void TanCongKeXau() {
        System.out.println("Ném");
    }
}
