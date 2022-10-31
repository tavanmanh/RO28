package com.vti.backend.ThuVien;

import java.time.LocalDate;

public class Bao extends TaiLieu{
    private LocalDate NgayPhatHanh;
    public Bao(int id, String TenNXB, int SoBan, LocalDate NgayPhatHanh) {
        super(id, TenNXB, SoBan);
        this.NgayPhatHanh = NgayPhatHanh;
    }
}
