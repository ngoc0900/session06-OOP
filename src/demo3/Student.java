package demo3;

import java.util.Scanner;

public class Student {
    // trường
    private String msv;
    private String fullName;
    private boolean sex;
    public Student(){

    }

    public Student(String msv, String fullName, boolean sex) {
        this.msv = msv;
        this.fullName = fullName;
        this.sex = sex;
    }
    public void ShowInfo(){
        System.out.println("ma sinh vien la: "+ msv);
        System.out.println("ten sinh vien la: "+ fullName);
        System.out.printf("gioi tinh: %s ", (sex ? "nam" : "nu"));
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;

    }
    public void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten sv");
        fullName = sc. nextLine();
        System.out.println("nhap ma sinh vien");
        msv = sc.nextLine();
        System.out.println("nhap gioi tinh true: nam , false: nu");
        sex = sc.nextBoolean();
    }
}
