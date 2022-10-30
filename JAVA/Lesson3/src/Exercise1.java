import java.util.Random;
import java.util.Scanner;
public class Exercise1 {
    private static void question1() {
        float acc1 = 5240.5f;
        float acc2 =10970.055f;
        int acc3=(int) Math.round(acc1);
        int acc4=(int) Math.round(acc2);
        System.out.println(acc3+" "+acc4);
    }
    private static void question2() {
        Random random=new Random();
        int a = random.nextInt(99999 - 0 + 1) ;
        if (a < 10000) {
            String x= String.valueOf(a);
            int dodai=5-x.length();
            for (int i=0;i<dodai;i++){
                x="0"+x;
            }
            System.out.println("Số ngẫu nhiên: " + x);
        }
        else {
            System.out.println("Số ngẫu nhiên: " + a);
        }
    }

    private static void question3(){
        Random random=new Random();
        int a = random.nextInt(99999 - 0 + 1) ;
        String x= String.valueOf(a);
        if (a < 10000) {
            int dodai=5-x.length();
            for (int i=0;i<dodai;i++){
                x="0"+x;
            }
        }
        System.out.println(x);
        System.out.println(x.substring(3, 5));
    }

    private static void question4(){
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a = ");
        a = sc.nextInt();
        while (true) {
            System.out.println("Nhập b = ");
            b = sc.nextInt();
            if (b != 0) {
                System.out.println((float) a / (float) b);
                break;
            } else {
                System.out.println("Nhập sai, Nhập lại");
            }
        }
    }

    public static void main(String[] args) {
        question4();
    }

}
