public class Main {
    public static void main(String[] args) {
        // khởi tạo đối tượng lớp dog
//        Dog dog = new Dog();
        Dog dog1 = new Dog("vang","cho ta",true,"Cau vang");
        Dog dog2 = new Dog("nau", "cho nhat",false,"Jeck");
        //truy cap vao thuoc tinh
        dog1.name = "shiba";
        System.out.println("cho 1 co ten la " +dog1.name+ " mau "+dog1.color);
        System.out.println("cho 2 co ten la " +dog2.name+ " mau "+dog2.color);
        // truy cap vao phuong thuc
        dog1.sua();
        dog2.sua();
    }
}
