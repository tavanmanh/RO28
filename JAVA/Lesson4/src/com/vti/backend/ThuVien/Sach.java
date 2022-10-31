package com.vti.backend.ThuVien;

public class Sach extends TaiLieu{
    private String TacGia;
    private int SoTrang;
    public Sach(int id, String TenNXB, int SoBan, String TacGia, int SoTrang) {
        super(id, TenNXB, SoBan);
        this.TacGia = TacGia;
        this.SoTrang = SoTrang;
    }
}
