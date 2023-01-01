package Linked_List;

public class AddingInLL {

/*
    for adding new ll in first place
    make a new node
    node should be pointing to head
    head will shifted to new node

    if head and tail are same in 1 only node
    tail will remain there and head will get shifted
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
public static int size;


//    Adding in-front  O(1)

        public void addFirst(int data){
            // step 1 new node
            Node newNode = new Node(data);
            size++;
            if(head == null){
                head = tail = newNode;
                return;
            }
            //step 2 newNode next = head
            newNode.next = head;//link

            //step 3 head - newNode
            head = newNode;
        }


//    Adding ll in last  O(1)
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
            if (head == null){
                head = tail = newNode;
            return;}

        tail.next = newNode;
        tail = newNode;
    }


    //    Adding ll in Middle  O(n)
    public void middleLL(int idx , int data){
            Node newNode = new Node(data);
            size++;
            Node temp = head;
            int i =0;

            while (i < idx-1){
                temp =temp.next;
                i++;
            }

            newNode.next = temp.next;
            temp.next = newNode;

    }

    public void print(){ //O(n)

            Node temp = head;
            while (temp != null){
                System.out.print(temp.data+ "->");
                temp = temp.next;
            }
        System.out.println("null");
    }



    public static void main(String[] args) {
        AddingInLL ll = new AddingInLL();

        ll.addFirst(1);

        ll.addFirst(2);

        ll.addLast(3);
        ll.addLast(4);
        ll.print();
        ll.middleLL(2 ,9);
        ll.print();
        System.out.println(ll.size);
    }
}
