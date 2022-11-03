package Exercise1.entity;

import java.util.Scanner;

public class KySu extends CanBo {

	private String nganhDaoTao;

	public KySu(String hoTen, int tuoi, GioiTinh gioiTinh, String diaChi, String nganhDaoTao) {
		super(hoTen, tuoi, gioiTinh, diaChi);
		this.nganhDaoTao = nganhDaoTao;
	}
	public KySu() {
		super();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Mời bạn nhập vào Bac: ");
		nganhDaoTao = scanner.next();
	}

	public String getNganhDaoTao() {
		return nganhDaoTao;
	}

	public void setNganhDaoTao(String nganhDaoTao) {
		this.nganhDaoTao = nganhDaoTao;
	}
	@Override
	public String toString() {
		return super.toString() + "\nKySU [nganhDaoTao=" + nganhDaoTao + "]";
	}

}
