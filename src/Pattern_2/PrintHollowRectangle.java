package Pattern_2;

public class PrintHollowRectangle {

    public static void hollow_rectangle(int totRows , int totCols){
//        outter loop
        for (int i = 1; i <totRows ; i++) {
//            inner -colums
            for (int j = 1; j < totCols; j++) {
                // cell -(i,j)
                if(i ==1 || i == totCols || j ==1 || j==totCols){
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
        hollow_rectangle(10 , 7);
    }

}
