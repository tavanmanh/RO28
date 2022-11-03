package Exercise2;

import java.util.Scanner;

public class Question1 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        //Question 1,2
        try {
            float result= device(7,2);
            System.out.println(result);

        } catch (Exception e) {
            System.out.println("cannot divide 0");
        } finally {
            System.out.println("divide completed!");
        }

        //Question 3
        int[] ints = { 1, 2, 3 };
        try {
            System.out.println(ints[10]);
        } catch (Exception e) {
            System.out.println("K tìm thấy");
        }

        //Question 4
        try {
            departments dep1 = new departments("Dep1");
            departments dep2 = new departments("Dep2");
            departments dep3 = new departments("Dep3");
            departments dep4 = new departments("Dep4");
            departments[] depArray = { dep1, dep2, dep3, dep4 };
            System.out.println(depArray[10]);

        }catch (Exception e){
            System.out.println("Cannot find department.");

        }
        //Question 5,6
        int k= Question1.inputAge();
        System.out.println(k);
    }
    public static Float device(int a, int b) {
        return (float) (a / b);
    }
    public static int inputAge() {
        while (true) {
            try {
                System.out.println("Mời bạn nhập số");
                int x = sc.nextInt();
                if (x >= 0) {
                    return x;
                } else {
                    System.out.println("Wrong inputing! The age must be greater than 0, please input again.");
                }
            } catch (Exception e) {
                System.out.println("wrong inputing! Please input an age as int, input again");
            }
        }
    }
}
