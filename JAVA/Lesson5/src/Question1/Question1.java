package Question1;

import java.util.ArrayList;
import java.util.Scanner;

public class Question1 {
    private static Scanner sc=new Scanner(System.in);;
    private static ArrayList<News> listNews=new ArrayList<News>();

    public static void main(String[] args) {
        while (true) {
            System.out.println(" 1. Insert news. ");
            System.out.println(" 2. View list news. ");
            System.out.println(" 3. Average rate . ");
            System.out.println(" 4. Exit. ");
            int menuChoose = sc.nextInt();
            switch (menuChoose) {
                case 1:
                    System.out.println("Nhập vào Title");
                    String title = sc.next();
                    System.out.println("Nhập vào PublishDate");
                    String publishDate = sc.next();
                    System.out.println("Nhập vào Author");
                    String author = sc.next();
                    System.out.println("Nhập vào Content");
                    String content = sc.next();
                    System.out.println("Nhập vào đánh giá 1");
                    int rate1 = sc.nextInt();
                    System.out.println("Nhập vào đánh giá 2");
                    int rate2 = sc.nextInt();
                    System.out.println("Nhập vào đánh giá 3");
                    int rate3 = sc.nextInt();
                    int[] rates = { rate1, rate2, rate3 };
                    News news = new News(title, publishDate, author, content, rates);
                    listNews.add(news);
                    break;
                case 2:
                    for (News news1 : listNews) {
                        news1.display();
                    }
                    break;
                case 3:
                    System.out.println("Đánh giá trung bình Rate");
                    for (News news1 : listNews) {
                        System.out.println("Title: " + news1.getTitle() + " RateAVG: " + news1.calculate());
                    }
                    break;
                case 4:
                    return;
            }
        }
    }
}
