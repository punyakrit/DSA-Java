package Sorting;

public class QuickSort {

//    average case nlogn

public static int partition(int arr[] , int si , int ei){
        int pivot = arr[ei];
        int i =si-1;

    for (int j = si; j < ei; j++) {
        if (arr[j]<=pivot){
            i++;
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
    }
    i++;
    int temp = pivot;
    arr[ei] = arr[i];
    arr[i] = temp;

    return i;
    }


    public static void sort( int arr[] , int si , int ei){
        if(si >=ei){
            return;
        }
        int pidx = partition(arr, si, ei);
        sort(arr , si , pidx-1);
        sort(arr , pidx+1 , ei);
    }



    public static void main(String[] args) {
        int arr[] = {3 ,7,8,4,2, 9,0,1};
        sort(arr , 0 , arr.length-1) ;
        printArr(arr);
    }


    static void printArr(int arr[]){
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
