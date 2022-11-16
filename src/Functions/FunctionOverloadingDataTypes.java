package Functions;

// function overloading with data types

public class FunctionOverloadingDataTypes {

    //function to calculate in sum
    public static int sum(int a , int b){
        return a+b;
    }

    //function to calculate float in sum
    public static float sum(float a , float b){
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println(sum(3,4));
        System.out.println(sum(3.5f, 6.9f));
    }
}
