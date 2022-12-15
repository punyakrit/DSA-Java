package OOPS;

public class Inheritance {

    public static void main(String[] args) {
        Dogs doge = new Dogs();
        doge.legs =4;
        System.out.println(doge.legs);
    }
}



// base class
class Animal{
    String color;

     void eat(){
        System.out.println("Eats");
    }

    void breath(){
        System.out.println("breathes");
    }
}


//Derived class

class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("Swims in water");
    }
}


class Mammals extends Animal{
    int legs;
}

class Dogs extends Mammals{
    String breed;
}