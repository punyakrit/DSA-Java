package OOPS;

public class GettersAndSetters {


    public static void main(String[] args) {
        Pencil p1 = new Pencil();
        p1.setColor("blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
    }

}

class Pencil{
    private String color;
    private int tip;

    String getColor(){
        return this.color;
    }

    int getTip(){
//        to get the private value to other class
        return this.tip;
    }

    void setColor(String newColor){
//        to get the private value to other class

        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }

}