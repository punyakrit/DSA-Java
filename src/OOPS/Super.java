package OOPS;

public class Super {
    public static void main(String[] args) {
        Hors h = new Hors();
        h.color = "red";
        System.out.println(h.color);

    }

}

class Anim{
    String color = "blue";
    Anim(){
        System.out.println("Animal is called");
    }
}

class Hors extends Anim{
    Hors(){
        super();

        System.out.println("horse constructor is called");
    }
}