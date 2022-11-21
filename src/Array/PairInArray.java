package Array;

public class PairInArray {
    public static void pairs(int no[]){
        for (int i = 0; i < no.length ; i++) {
            int curr = no[i];
            for (int j = i+1; j <no.length ; j++) {
                System.out.print("(" + curr+","+no[j]+") ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        pairs(arr);
    }
}
