package ArrayList;


import java.util.ArrayList;

public class Basics {

//    dynamic size
//    primitive data types can't be stored directly

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();


//        adding element in list | time O(1)

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(2 ,11);
        System.out.println(list);


        //Get operation  | time O(1)
        int element = list.get(2);
        System.out.println(element);


        //remove element | time O(n)
        list.remove(3);
        System.out.println(list);


        //set element at index | time O(n)
        list.set(2 ,10);
        System.out.println(list);

//        contains element | time O(n)

        System.out.println(list.contains(1));



    }


}
