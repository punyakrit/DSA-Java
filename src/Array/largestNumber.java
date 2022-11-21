package Array;

public class largestNumber {
    public static int largest(int no[]){
        int largest =Integer.MIN_VALUE;  // -Infinity
        for (int i = 0; i < no.length ; i++) {
            if (largest < no[i]){
                largest = no[i];
            }
            else {

            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int number[] = {1,2,5,8,7,9};
        System.out.println("largest value is "+  largest(number));
    }
}
