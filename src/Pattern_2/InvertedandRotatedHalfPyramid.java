package Pattern_2;

public class InvertedandRotatedHalfPyramid {
    public static void halfPyramid(int n){
        for (int i = 1; i <=n ; i++) {
            //spaces
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        halfPyramid(4);
    }
}
