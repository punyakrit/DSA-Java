package Linked_List;
import java.util.*;

public class FrameworkLL {
    public static void main(String[] args) {
        // creating ll
        LinkedList<Integer> ll = new LinkedList<>();

        // add
        ll.addLast(1);
        ll.add(2);
        ll.addFirst(0);

        System.out.println(ll);

        ll.removeFirst();
        System.out.println(ll);
    }
}
