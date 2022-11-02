package Exercise2.Question3;

public class HinhChuNhat {
    private Float a;
    private Float b;

    public HinhChuNhat() {
    }

    public HinhChuNhat(Float a, Float b) {
        this.a = a;
        this.b = b;
    }

    public Float tinhChuvi() {
        return 2 * (a + b);
    }
    public Float diệnTich() {
        return a * b;
    }

}
