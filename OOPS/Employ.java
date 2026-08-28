package OOPS;
class employee{
    private int id;
    private String name;
    private int age;
    private String address;
    public void setid(int id){
        this.id = id;
    }
    public void setname(String name){
        this.name = name;
    }
    public void setage(int age){
        this.age = age;
    }
    public void setaddress(String address){
        this.address = address;
    }
    public int getid(){
        return id;
    }
    public String getname(){
        return name;
    }
    public int getage(){
        return age;
    }
    public String getaddress(){
        return address;
    }
}
    
public class Employ {
    public static void main(String[] args) {
        employee e = new employee();
        e.setid(1234);
        e.setname("Harshit");
        e.setage(20);
        e.setaddress("Ranchi");
        System.out.println("emp id = "+e.getid());
        System.out.println("name = "+e.getname());
        System.out.println("age = "+e.getage());
        System.out.println("address = "+e.getaddress());
    }
}
