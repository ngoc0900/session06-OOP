package demo3;

import java.util.Scanner;

public class Run1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student std1 = new Student();
//        System.out.println("nhap ten sv");
//        String std1Name = sc. nextLine();
//        System.out.println("nhap ma sinh vien");
//        String std1Msv = sc.nextLine();
//        System.out.println("nhap gioi tinh true: nam , false: nu");
//        boolean std1Sex = sc.nextBoolean();
//        std1.setFullName(std1Name);
//        std1.setMsv(std1Msv);
//        std1.setSex(std1Sex);
        std1.inputData();
        std1.ShowInfo();
    }
}
