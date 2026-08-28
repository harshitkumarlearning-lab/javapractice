package Revision1;
public class m1 {
    public static void main(String[] args) {
        calculator calc = new calculator();
        calc.add();
        int red = calc.sub();
        System.out.println(red);
        int y = 30;
        int z = 30;
        calc.mul(y,z);
        int ans = calc.div(y,z);
        System.out.println(ans);
    }
}
class calculator {
    int a ;
    int b;
    int res;

    void add(){
        a=10;
        b=20;
        res = a+b;
        System.out.println(res);
    }
    int sub (){
        a = 20;
        b = 30;
        res = b-a;
        return res;
    }
    void mul(int y,int z){
        res = y*z;
        System.out.println(res);
    }
    int div (int y,int z){
        res = y/z;
        return res;
    }
}
