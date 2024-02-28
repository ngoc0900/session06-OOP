package demo2;

public class Cat {
    // truong
    private String catName;
    private int age;
    private String color;

    public Cat() {
    }

    public Cat(String catName, int age, String color) {
        this.catName = catName;
        this.age = age;
        this.color = color;
    }
    /* phuong thuc in thong tin con meo */
    public void ShowInfo(){
        System.out.println("toi ten la " + catName);
        System.out.println("nam nay toi :" + age);
        System.out.println("toi co mau: "+ color);
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

