package Functions.Problems;

public class SwapingNumber {

    //  call by value is used in java it sends the value in different function the copy of value
    public static void swap(int a , int b){
        int temp;

        temp = a;
        a =b;
        b= temp;

    }

    public static void main(String[] args) {
        int a =5;
        int b =10;
        swap(a,b);

        System.out.println(a);
        System.out.println(b);
    }
}
