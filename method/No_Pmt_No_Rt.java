package method;

class No_Pmt_No_Rt {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.add();
    }
}
 class Calculator {
    int a;
    int b;
    int res;
    void add()
    {
        a=10;
        b=20;
        res=a+b;
        System.out.println(res);
    }
}
