package demo2;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        Cat cat1 = new Cat();
        String cat1Name = sc.nextLine();
        cat1.setCatName(cat1Name);
        cat1.ShowInfo();
        Cat cat2 = new Cat("tom",100,"vang");
        cat2.ShowInfo();
        System.out.println("cat 2 name la :"+  cat2.getCatName());
    }
}
