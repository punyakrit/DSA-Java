package Array;

public class binarySearch {
    public static int search(int no[], int key){
        int start = 0 , end =no.length-1;
        while (start<=end){
            int mid = (start+end)/2;

//            comparison
            if (no[mid]==key){
                return mid;
            }
            if (no[mid]<key){
                start = mid+1;
            }
            else {
                end =mid -1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int number[] = {1,2,6,9,15,56,988,485};
        int key = 15;
        System.out.println("Key is " + search(number,key));
    }
}
