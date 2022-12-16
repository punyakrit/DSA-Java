package Recursion_Basic;

public class SumOfNaturalNumbers {

    static int sum(int n){
        if(n == 1){
            return 1;
        }
        int sum1=0;
        sum1 = n+ sum(n-1);
        return sum1;

    }

    public static void main(String[] args) {
        System.out.println(sum(5));
    }
}
