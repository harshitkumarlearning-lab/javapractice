package OOPS;
class Person{
    public String name;
    public String address;
    public int age;
}
class Student extends Person{
    public int marks;
    public String grade;
    Student(String name,String address,int age,int marks,String grade){
        this.name = name;
        this.address=address;
        this.age= age;
        this.marks = marks;
        this.grade = grade;
    }
    public void display(){
        System.out.println("Name = "+name);
        System.out.println("Address = "+address);
        System.out.println("Age = "+age);
        System.out.println("marks = "+marks);
        System.out.println("grade = "+grade);
    }
}

public class studentDetail {
    public static void main(String[] args) {
        Student std = new Student("Sachin","MI",51,100,"A");
        std.display();
    }
}
