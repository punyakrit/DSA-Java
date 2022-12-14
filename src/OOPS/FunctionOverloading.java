package OOPS;

public class FunctionOverloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(3,6));
        System.out.println(calc.sum((float) 4.3,(float) 5.7));
        System.out.println(calc.sum(4 ,7,9));
    }
}

//      Function Overloading
class Calculator{
    int sum(int a , int b){
        return a+b;
    }

    float sum(float a , float b){
        return a+b;
    }

    int sum(int a , int b , int c){
        return a+b+c;
    }
}