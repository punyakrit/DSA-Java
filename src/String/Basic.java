package String;

import java.util.Scanner;

public class Basic {

    public static void print(String name){
        for (int i = 0; i <name.length() ; i++) {
            System.out.print(name.charAt(i)+ " ");
        }

    }

    public static void main(String[] args) {
/*
        char arr[] = {'a','b','c','d'};
        String str = "abcd";
        String str2 = new String("xyz");

        //String are immutable
        Scanner sc = new Scanner(System.in);

        String single_name = sc.next();
        System.out.println("name " +single_name);

        String name = sc.nextLine();
        System.out.println("full name : "+name);
*/

//        String name= "Hello World";
//        System.out.println(name.length());
//


        //concatenation

        String fname = "d2edc67182";
        String lname = "Singh";
        String fullName = fname+ " " + lname;
        print(fullName);

    }
}
