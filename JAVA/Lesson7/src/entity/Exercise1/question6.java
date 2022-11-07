package entity.Exercise1;

public class question6 {
    public static void main(String[] args) {
        System.out.println("Tạo 2 Primary Student: ");
        PrimaryStudent pSt1 = new PrimaryStudent();
        PrimaryStudent pSt2 = new PrimaryStudent();
        System.out.println("Tạo 6 Secondary Student: ");
        SecondaryStudent sST1 = new SecondaryStudent();
        SecondaryStudent sST2 = new SecondaryStudent();
        SecondaryStudent sST3 = new SecondaryStudent();
        SecondaryStudent sST4 = new SecondaryStudent();
        SecondaryStudent sST5 = new SecondaryStudent();
        SecondaryStudent sST6 = new SecondaryStudent();
        System.out.println(PrimaryStudent.COUNT);
        System.out.println(SecondaryStudent.COUNT);
    }
}
