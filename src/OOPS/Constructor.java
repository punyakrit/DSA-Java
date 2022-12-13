package OOPS;

public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student("Anoop");
        Student s2 = new Student();
        s1.name = "hello";
    }
}


class Student{
    String name;

/*
    constructor----
    Student(){
        System.out.println("Constructor is called");
    }
*/

    Student(String name){
        this.name = name;
    }

    Student(){
        System.out.println("Constructor is called");
    }

}