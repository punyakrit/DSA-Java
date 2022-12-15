package OOPS;

import java.util.Queue;

public class Interface {
    public static void main(String[] args) {
        queen q = new queen();
        q.moves();
    }
}

interface  ChessPlayer{
    void moves();

}

class queen implements ChessPlayer{
    public void moves(){
        System.out.println("Up , down , left ,right");
    }
}

class rook implements ChessPlayer{
    public void moves(){
        System.out.println(" left, right");
    }
}
