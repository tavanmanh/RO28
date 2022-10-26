package vti;

public class Exercise6 {
    private static void question1() {

        for (int i = 0; i < 10; i=i+2) {
                System.out.print(i + " ");
            }
        }

    private static void question3(Account account) {
        System.out.println("ID: " + account.id + " Email: " + account.email + " Username: " + account.Username + " FullName: " + account.FullName + " CreareDate: " + account.createDate);
    }

    private static void question3() {

        for (int i = 0; i < 10; i=i+2) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        question1();
    }
}
