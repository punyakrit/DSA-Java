package Recursion_Basic;

public class PrintDecreasingOrder {

    static void printDec(int n){
        if(n==1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n-1);
    }



    public static void main(String[] args) {

        printDec(10);
    }
}
