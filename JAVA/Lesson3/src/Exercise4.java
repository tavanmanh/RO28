import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercise4 {
    public static void question1() {
        String chuoi;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi bất kỳ: ");
        chuoi=scanner.nextLine();
        StringTokenizer stringTokenizer = new StringTokenizer(chuoi);
        int soTuTrongChuoi = stringTokenizer.countTokens();
        System.out.println("Số từ có trong chuỗi \"" + chuoi + "\" = " + soTuTrongChuoi);
    }
    public static void question2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi 1: ");
        String s1 = sc.next();
        System.out.println("Nhập vào chuỗi 2: ");
        String s2 = sc.next();
        System.out.println(s1 + " " + s2);
    }
    public static String question3(String name){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập tên: ");
//        name = sc.nextLine();
        String firstLetter = name.substring(0, 1);
        String remainingLetters = name.substring(1, name.length());
        firstLetter = firstLetter.toUpperCase();
        name = firstLetter + remainingLetters;
        return name;
    }
    public static void question4() {
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        name = sc.nextLine();
        name = name.toUpperCase();
        for (int i = 0; i < name.length(); i++) {
            System.out.println("Ký tự thứ " + i + " là: " + name.charAt(i));
        }
    }
    public static void question5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ: ");
        String firstName = sc.nextLine();
        System.out.println("Nhập tên: ");
        String lastName = sc.nextLine();
        System.out.println(firstName+" "+lastName);
    }
    public static void question6() {
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        name = sc.nextLine();
        name= name.trim();
        String[] words = name.split(" ");
        String lastName = words[0];
        String firstName = words[words.length - 1];
        String middleName="";
        for (int i = 1; i < words.length - 1; i++) {
            middleName += words[i] + " ";
        }
        System.out.println("Họ là: " + lastName);
        System.out.println("Tên đệm là: " + middleName);
        System.out.println("Tên là: " + firstName);
    }
    public static void question7() {
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.println("Nhập họ tên đầy đủ");
        name = sc.nextLine();
        String full = name.replaceAll("\\s+", " ");
        String[] words = full.split(" ");
        String fullname="";
        for (String word : words) {
            fullname =fullname + question3(word)+" ";
        }
        System.out.println(full);
        System.out.println(fullname);

    }
    public static void question8() {
        String[] groupNames = { "java", "java 11223", "3243243" };
        for (String groupName : groupNames) {
            if (groupName.contains("java")) {
                System.out.println(groupName);
            }
        }
    }
    public static void question9() {
        String[] groupNames = { "Java", "PhP", "C++" };
        for (String groupName : groupNames) {
            if (groupName.equals("Java")) {
                System.out.println(groupName);
            }
        }
    }
    public static void question10() {
        Scanner scanner = new Scanner(System.in);
        String s1, s2;
        int a=0;
        System.out.println("Nhập chuỗi 1");
        s1 = scanner.nextLine();
        System.out.println("Nhập chuỗi 2");
        s2 = scanner.nextLine();
        if(s1.length()!= s2.length()){
            System.out.println("Đây không phải chuỗi đảo ngược");
        }
        else {
            for (int i=0;i< s1.length();i++){
                if(s1.charAt(i) !=  s2.charAt(s1.length()-1-i)){
                    a=1;
                    break;
                }
            }
            if(a==0){
                System.out.println("Đây là chuỗi đảo ngược");
            }
            else {
                System.out.println("Đây không phải chuỗi đảo ngược");
            }
        }
    }
    public static void question11() {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Mời bạn nhập vào một chuỗi: ");
        str = sc.nextLine();
        sc.close();
        int SL = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                SL++;
            }
        }
        System.out.println(SL);
    }

    public static void question12() {
        Scanner sc = new Scanner(System.in);
        String s1, s2 = "";
        System.out.println("Nhập chuỗi 1");
        s1 = sc.nextLine();
        for (int i = s1.length() - 1; i >= 0; i--) {
            s2 += s1.charAt(i);
        }
        System.out.println(s2);
    }
    public static void question13() {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Mời bạn nhập vào một chuỗi: ");
        str = sc.nextLine();
        int kt = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) >= '0' && str.charAt(i)<='9'){
                kt=1;
                break;
            }
        }
        if(kt==0){
            System.out.println("chuoi k so");
        }
        else {
            System.out.println("chuoi co so");
        }

    }
    public static void question14() {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Mời bạn nhập vào một chuỗi: ");
        str = sc.nextLine();
        System.out.println("Mời bạn nhập từ muốn thay thế ");
        String x1=sc.next();
        System.out.println("Mời bạn nhập từ thay thế");
        String x2=sc.next();
        String full = str.replaceAll(x1, x2);
        System.out.println(full);
    }
    public static void question15(){
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.println("Nhập họ tên đầy đủ");
        name = sc.nextLine();
        String full = name.replaceAll("\\s+", " ");
        String[] words = full.split(" ");
        String fullname="";
        for (int i=0;i<words.length;i++) {
            fullname =fullname + words[words.length-1-i]+" ";
        }
        System.out.println(fullname);

    }
    public static void question16(){
        Scanner sc = new Scanner(System.in);
        String name;
        int n;
        System.out.println("Nhập vào chuỗi");
        name = sc.nextLine();
        System.out.println("Nhập vào số");
        n=sc.nextInt();
        if(n==0){
            System.out.println("KO");
        }
        else {
            if (name.length()%n==0){
                for (int i = 0; i < name.length(); i += n) {
                    System.out.println(name.substring(i, i + n));
                }
            }
            else {
                System.out.println("KO");
            }
        }
    }

    public static void main(String[] args) {
        question16();

    }
}
