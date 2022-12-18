package Sorting;

import java.util.Arrays;

public class MergeSort {

//    Divide and Conquer
//    time complexity = nlogn

    public static void merger(int arr[], int si , int ei){
        if(si>= ei){
            return;
        }

        int mid = si +(ei-si)/2;
        merger(arr ,si ,mid);
        merger(arr , mid+1 , ei);
        merger(arr ,si , mid,ei);
    }


    public static void merger(int arr[], int si , int mid,int ei) {
        int temp[] = new int [ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;

        while (i <=mid && j <= ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;

            }
            else {
                temp[k] = arr[j];
                j++;

            }
            k++;
        }
        //left part
        while (i <=mid){
            temp[k++] = arr[i++];
        }

        //right part

        while (j<= ei){
            temp[k++] =arr[j++];
        }

        for (k =0 , i=si; k <temp.length ; k++ , i++) {
            arr[i] = temp[k];
        }

    }


    static void printArr(int arr[]){
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int arr[] = {2 ,7, 3, 5, 1, 9,6 ,4 ,8};
        merger(arr , 0, arr.length-1);
        printArr(arr);
        int arr1[] = {2 ,7, 3, 5, 1, 9,6 ,4 ,8};

//        Arrays.sort(arr1);
//
//        printArr(arr1);
    }

}
