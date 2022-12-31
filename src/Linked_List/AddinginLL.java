package Linked_List;

import java.util.LinkedList;

public class AddinginLL {

    public static class Node{
        int data;
        Basic.Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }

    }

    public static Basic.Node head;
    public static Basic.Node tail;

    public void addFirst(int data){
        // create new node
        Node newNode = new Node(data);

        if(head == null){
            head = tail = null;

        }

        // newNode next = head
        newNode.next = head; // link

//        head = newNode;

    }




    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
    }
}
