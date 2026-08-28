package OOPS;
class student{
    private int rollno;
    private String name;
    private String address;
    public void setrollno(int rollno){
        this.rollno = rollno;
    }
    public void setname(String name){
        this.name = name;
    }
    public void setaddress(String address){
        this.address = address;
    }
    public int getrollno(){
        return rollno;
    }
    public String getname(){
        return name;
    }
    public String getaddress(){
        return address;
    }
}

public class student1 {
    public static void main(String[] args) {
        student s1 = new student();
        s1.setrollno(10);
        s1.setname("Harshit");
        s1.setaddress("Ranchi");

        System.out.println("roll no: "+s1.getrollno());
        System.out.println("name: "+s1.getname());
        System.out.println("address: "+s1.getaddress());


        System.out.println();

        
        student s2 = new student();
        s2.setrollno(11);
        s2.setname("Arihant");
        s2.setaddress("muzzafarnagar");

        System.out.println("roll no: "+s2.getrollno());
        System.out.println("name: "+s2.getname());
        System.out.println("address: "+s2.getaddress());
    }
}
