package btvn;
//Tạo Lớp Product chứa thông tin mã sản phẩm, tên sản phẩm, giá bán , giá nhập
//
//1 contructor không tham số
//1 contructor Đầy đủ tham số
//getter và setter đầy đủ
//1 phương thức nhập thông tin sản phẩm
//1 hiển thị thông tin sản phẩm
//1 phương thức tính lãi xuât (lai xuat = giá bán - giá nhập)
//
//Tạo lớp Test
//có main
//có menu
//    =============MEnu===========
//
//Nhập vào thông tin sản phâm
//Hiển thị thông tin
//Hiển thị lãi xuất

import java.util.Scanner;

public class Product {
    private  String msp;
    private String nameSp;
    private int giaBan;
    private int giaNhap;

    public Product() {
    }

    public Product(String msp, String nameSp, int giaBan, int giaNhap) {
        this.msp = msp;
        this.nameSp = nameSp;
        this.giaBan = giaBan;
        this.giaNhap = giaNhap;
    }

    public void ShowProduct(){
        System.out.println("ma san pham la: "+ msp);
        System.out.println("ten san pham la: "+ nameSp);
        System.out.println("gia ban: " + giaBan + " VNĐ");
        System.out.println("gia nhap: "+ giaNhap+ " VNĐ");
    }

    public void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten san pham");
        nameSp = sc. nextLine();
        System.out.println("nhap ma san pham");
        msp = sc.nextLine();
        System.out.println("nhap gia ban");
        giaBan = sc.nextInt();
        System.out.println("nhap gia nhap");
        giaNhap = sc.nextInt();
    }

    public void tinhLaiXuat(){
        int laiXuat = 0;
        laiXuat = giaBan - giaNhap;
        System.out.println("Lai xuat la: "+ laiXuat+ " VNĐ");
    }

    public String getMsp() {
        return msp;
    }

    public void setMsp(String msp) {
        this.msp = msp;
    }

    public String getNameSp() {
        return nameSp;
    }

    public void setNameSp(String nameSp) {
        this.nameSp = nameSp;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public int getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(int giaNhap) {
        this.giaNhap = giaNhap;
    }
}
