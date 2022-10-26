package vti;

import java.time.LocalDate;
import java.util.Date;
import java.util.Random;

public class Exercise4 {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt();
        System.out.printf("%d%n", n);


        //Question 2
        float m = random.nextFloat();
        System.out.printf("%f%n", m);

        //Question 3
        String[] name = { "A", "B", "D", "E", "F" };
        int i = random.nextInt(name.length-1);
        System.out.println("Tên ngẫu nhiên 1 bạn trong lớp: " + name[i] +"\n");

        //Question 4
        int minDay = (int) LocalDate.of(1995, 7, 24).toEpochDay();
        int maxDay =(int) LocalDate.of(1995, 12, 20).toEpochDay();
        long randomDay = minDay + random.nextInt(maxDay - minDay);
        LocalDate randomBirthDate = LocalDate.ofEpochDay(randomDay);
        System.out.println(randomBirthDate);

        //Question 5
        int now = (int) LocalDate.now().toEpochDay();
        int randomDate = now - random.nextInt(365);
        LocalDate reusultDate = LocalDate.ofEpochDay(randomDate);
        System.out.println("Ngày ngẫu nhiên là: " + reusultDate);

        //Question 6
        int maxDay1 = (int) LocalDate.now().toEpochDay();
        long randomDay1 = random.nextInt(maxDay1);
        LocalDate resultDate1 = LocalDate.ofEpochDay(randomDay1);
        System.out.println("1 Ngày ngẫu nhiên trong quá khứ: " + resultDate1);

        //Question 7
        int z = random.nextInt(999 - 100 + 1) + 100; // Công thức: (sốmax - số min + 1) + số min
        System.out.println(z);

    }
}
