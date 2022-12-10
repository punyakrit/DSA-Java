package OOPS;

public class Basic {

    public static void main(String[] args) {
        Pen p1 = new Pen();
    }
}

class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}