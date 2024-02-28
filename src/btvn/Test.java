package btvn;

import demo3.Student;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product ptd1 = new Product();
        do {
            System.out.println("=====MENU=====");
            System.out.println("1. Nhap vao thong tin san pham ");
            System.out.println("2. Hien thi thong tin ");
            System.out.println("3. Hien thi lai xuat ");
            System.out.println("4. Thoat ");
            System.out.println("Mời bạn chọn: ");
            int chose = Integer.parseInt(sc.nextLine());
            switch (chose){
                case 1:
                    ptd1.inputData();
                    break;
                case 2:
                    ptd1.ShowProduct();
                    break;
                case 3:
                    ptd1.tinhLaiXuat();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Chon lai tu 1-4!");
            }
        }while (true);
    }
}
