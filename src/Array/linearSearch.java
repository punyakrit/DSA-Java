package Array;

public class linearSearch {
    public static int Search(int no[] , int key){
        for (int i = 0; i < no.length; i++) {
            if (no[i] == key){
                return i;
            }
        }
        return  -1;
    }

    public static void main(String[] args) {
        int number[] = {1 ,3,6,8,2, 67,9,001};
        int key =3;
        int index = Search(number, key);
        if (index == -1){
            System.out.println("Key not found");
        }
        else {
            System.out.println("Key found "+ index);
        }
    }
}
