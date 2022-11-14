package Functions;

import java.util.Scanner;

public class FunctionExample {

    public static int calculate(int num1 , int num2){//   parameters

        int sum = num1 + num2;
        return sum;
    }

    //      main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculate( a ,b);//   arguments
        System.out.println(sum);
    }


}
