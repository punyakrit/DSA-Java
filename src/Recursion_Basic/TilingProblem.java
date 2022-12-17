package Recursion_Basic;

public class TilingProblem {

    public static int tile(int n){
        if(n ==0 || n ==1){
            return 1;
        }

        //vertical choice
        int fnm1 = tile(n-1);

        //horizontal choice
        int fnm2 = tile(n-2);

        int total = fnm1+ fnm2;

        return total;
    }

    public static void main(String[] args) {
        System.out.println(tile(5));
    }
}
