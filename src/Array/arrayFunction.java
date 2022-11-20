package Array;

import java.util.Scanner;

public class arrayFunction {
    public static void main(String[] args) {
        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);

//        lenght of array
        System.out.println("length of array " +marks.length);

//input in array
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
//        update value
        marks[1] = marks[1]+3;
        System.out.println(marks[1]);

        int per = (marks[0] + marks[1]+ marks[2])/3;
        System.out.println("percent is " +per);
    }
}
