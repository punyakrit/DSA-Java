package Recursion_Basic;

public class PrintIncreasingOrder {

    static void printInc(int n){
        if(n==10) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printInc(n+1);
    }

    public static void main(String[] args) {
        printInc(1);
    }
}
