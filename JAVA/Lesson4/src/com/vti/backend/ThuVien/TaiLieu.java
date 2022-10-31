package com.vti.backend.ThuVien;

public class TaiLieu {
    int id;
    private String TenNXB;
    private int SoBan;

    public TaiLieu() {
    }

    public TaiLieu(int id, String tenNXB, int soBan) {
        this.id = id;
        this.TenNXB = tenNXB;
        this.SoBan = soBan;
    }

    @Override
    public String toString() {
        return "TaiLieu{" +
                "id=" + id +
                ", TenNXB='" + TenNXB + '\'' +
                ", SoBan=" + SoBan +
                '}';
    }
}
