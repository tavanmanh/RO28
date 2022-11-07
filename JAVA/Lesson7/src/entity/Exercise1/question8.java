package entity.Exercise1;

public class question8 {
    public void q8() throws Exception {

        System.out.println("Tạo 6 hình chữ nhật.");
        HinhChuNhat[] arr = new HinhChuNhat[6];
        for (int i = 0; i < 6; i++) {
            System.out.println("Hình " + (i + 1) + ":");
            System.out.println("Canh a: ");
            Float a = Insert.inputFloat();
            System.out.println("Canh b: ");
            Float b = Insert.inputFloat();
            HinhChuNhat hcn = new HinhChuNhat(a, b);
            arr[i] = hcn;
        }
    }

    public static void main(String[] args) throws Exception{
        question8 ques8= new question8();
        ques8.q8();
    }

}
