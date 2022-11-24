package Sorting;

public class BubbleSort {
    public static void bubbleSort(int arr[]){
        int swaps =0;
        for (int turn = 0; turn <arr.length-1 ; turn++) {

            for (int j = 0; j < arr.length -1 -turn ; j++) {
                swaps++;
                if (arr[j] > arr[j+1]){
//                  swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }
        System.out.println(swaps);
    }

    public static void print(int arr[]){
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        bubbleSort(arr);
        print(arr);
    }
}
