package com.vti.backend.ThuVien;

public class TapTri extends TaiLieu{
    private int SoPhatHanh;
    private int ThangPhatHanh;
    public TapTri(int id, String TenNXB, int SoBan, int SoPhatHanh, int ThangPhatHanh) {
        super(id, TenNXB, SoBan);
        this.SoPhatHanh = SoPhatHanh;
        this.ThangPhatHanh = ThangPhatHanh;
    }

}
