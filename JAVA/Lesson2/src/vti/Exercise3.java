package vti;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Exercise3 {
    public static void main(String[] args) {
        Locale locale = new Locale("vn", "VN");
        DateFormat dateformat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
        String date = dateformat.format(new Date());
        System.out.println(date);

        //Question 2
        String pattern = "YYYY-MM-DD-HH-MM-SS";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date1 = simpleDateFormat.format(new Date());
        System.out.println(date1);

        //Question 3
        String pattern2 = "YYYY";
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat(pattern2);
        System.out.println(simpleDateFormat1.format(new Date()));

        //Question 4
        String pattern3 = "YYYY-MM";
        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat(pattern3);
        System.out.println(simpleDateFormat3.format(new Date()));

        //Question 5
        String pattern5 = "MM-DD";
        SimpleDateFormat simpleDateFormat5 = new SimpleDateFormat(pattern5);
        System.out.println(simpleDateFormat5.format(new Date()));
    }

}
