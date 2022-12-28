package Linked_List;

import java.util.LinkedList;

public class Basic {

/*
    linear and dynamic representation
      single node has 2 parts init consists
    -> data to store the value int, string , char ,boolean
      -> it also stores next , reference or pointer that links to another node
      it ends when null value is stored in end
*/




   public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }

    }

    public static Node head;
   public static Node tail;


    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

    }



}

