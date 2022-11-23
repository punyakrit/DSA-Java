package Array;

public class subArray {
    public static void array(int arr[]){
        int sum = 0;
        for (int i = 0; i <arr.length ; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
            int end = j;
                for (int k = start; k <=end ; k++) {
                    System.out.print(arr[k]+" ");
                    sum=arr[k]+sum;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        array(arr);

    }
}
