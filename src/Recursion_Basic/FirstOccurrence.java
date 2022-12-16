package Recursion_Basic;

public class FirstOccurrence {
    public static int firOcc(int arr[] , int key , int i){
        if(arr.length == i){
            return -1;
        }
        if (arr[i] == key){
            return i;
        }
        return firOcc(arr , key , i+1);
    }

    public static void main(String[] args) {
        int arr[] = {  2 ,3,4, 5, 6,7 ,8,9,6 ,4,2 };
        System.out.println(firOcc(arr , 5 ,0));
    }

}
