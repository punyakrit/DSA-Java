package Array;

public class ReverseArray {
        public static void reverse(int arr[]){
            int first=0;
            int last = arr.length-1;
            while (first <last){
                int temp = arr[last];
                arr[last] = arr[first];
                arr[first] = temp;

                first++;
                last--;

            }
        }

    public static void main(String[] args) {
        int no[] ={1,3,5,7,9};
        reverse(no);

        for (int i = 0; i <no.length ; i++) {
            System.out.print(no[i]+ " ");
        }
        System.out.println();
    }
}
