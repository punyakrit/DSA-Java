package Pattern_2;

public class HollowRhombus {
    public static void hollow(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                // cell -(i,j)
                if(i ==1 || i == n || j ==1 || j==n){
                    //boundary cells
                    System.out.print("*");

                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hollow(5);
    }
}
