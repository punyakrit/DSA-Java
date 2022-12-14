package Linked_List;

public class FunctionInLL {

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


            //          ADDING IN LINKED LIST

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



    //          REMOVING IN LINKED LIST


    // Removing in first in LL
    public int removeFirst(){
            if(size == 0){
                System.out.println("LL is empty");
                return Integer.MIN_VALUE;
            } else if (size ==1 ) {
                int val = head.data;
                head =tail = null;
                size=0;
                return val;

            }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    //      Remove last in ll
    public int removeLast(){
        if(size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if (size ==1 ) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for (int i = 0; i <size -2 ; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return  val;
        
        }
    

//              PRINTING IN LINKED LIST

    public void print(){ //O(n)

            Node temp = head;
            while (temp != null){
                System.out.print(temp.data+ "->");
                temp = temp.next;
            }
        System.out.println("null");
    }


    //              SEARCHING IN LINKED LIST

    public int itrSearch(int key){
            Node temp = head;
            int i= 0;
            while (temp != null){
                if (temp.data == key ){
                    return  i;
                }
                temp = temp.next;
                i++;
        }
            return  -1;
    }

    //          SEARCH IN RECURSION
        public int helper(Node head , int key){
            if (head == null){
                return -1;
            }
            if (head.data == key){
                return 0;
            }
            int idx = helper(head.next , key);
            if (idx == -1){
                return  -1;
            }
            return  idx+1;

        }
        public int recSearch(int key){
            return helper(head , key);
        }


//        REVERSE A LINKED LIST

    public void revLL(){//   O(n)
            Node prev = null;
            Node curr = tail = head;
            Node next;
            while (curr!= null){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            head = prev;
    }

//    REMOVE AN Nth NODE FROM END
    public void deleteEnd(int n){
            int sz =0;
            Node temp = head;
            while (temp != null){
                temp = temp.next;
                sz++;
            }
            if (n ==sz){
                head = head.next;
                return;
            }

            int i =1;
            int iToFind = sz-n;
            Node prev = head;
            while (i <iToFind){
                prev = prev.next;
                i++;
            }

            prev.next = prev.next.next;
            return;
    }

    //if ll is cycle floydes cycles finding algo

    public static boolean isCycle(){
            Node slow = head;
            Node fast = head;

            while (fast!= null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast){
                    return true;
                }
            }
            return false;
    }


    //      Removing cycle in LL

    public static void removeCycle(){
            //detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle =false;
        while (fast!= null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                cycle = true;
                break;
            }
        }
        if (cycle == false){
            return;
        }

        // finding meeting points

        slow = head;
        Node prev = null; // last Node
        while (slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }


//      remove cycle -> last.next = null
        prev.next = null;

    }



    public static void main(String[] args) {
        FunctionInLL ll = new FunctionInLL();
//        ll.addFirst(1);
//        ll.addFirst(2);
//        ll.addLast(3);
//        ll.addLast(4);
//        ll.middleLL(2 ,9);
//        ll.print();
//        System.out.println(ll.size);
//        ll.removeFirst();
//        ll.print();
//        ll.removeLast();
//        ll.print();
//        System.out.println(ll.itrSearch(3));
//        System.out.println(ll.recSearch(9));
//        ll.revLL();


        /*


//        cycle part

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;
//        1 -> 2 -> 3 -> 1
        System.out.println(isCycle());

         */

        //      Removing cycle in ll

        head = new Node(1);
        Node temp = new Node(2);
        head.next =temp;

        head.next.next = new Node(3);
        head.next.next.next = temp;
//        1 , 2 ,3 ,2
        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());

    }
}
