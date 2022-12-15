package OOPS;

public class AbstractClass {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();

        Chicken c = new Chicken();
        c.walk();
        c.eat();
    }

}

abstract class Ani{
    void eat(){
        System.out.println("Animal eats");
    }
    abstract void walk();
}


class Horse extends Ani{
    void walk(){
        System.out.println("walks on 4 legs");
    }
}

class Chicken extends Ani{
    void walk(){
        System.out.println("walks on 2 legs");
    }
}