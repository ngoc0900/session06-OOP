public class Dog {
    // thuộc tính
    public String color;
    public String type;
    public Boolean sex;
    public String name;
    // contructor phuowng thuc khoi tao k tham so
    public Dog(){

    }
    // contructor phuowng thuc khoi tao du tham so
    public Dog(String color,String type,Boolean sex,String name){
        this.color = color;
        this.type = type;
        this.sex = sex;
        this.name = name;
    }
    // phuong thuc
    public void sua(){
        System.out.println(name +" dang sua");
    }

}
