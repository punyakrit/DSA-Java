package Array_2D;

public class SearchInSortedMatrix {

    public static boolean search(int matrix[][] , int key){
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j <matrix[i].length ; j++) {
//                if(key == matrix[i][j]){
//                    System.out.println("key found ");
//                }
//                else {
//                    System.out.println("key not found");
//                }
//            }
//        }
        
        int row =0 , col= matrix[0].length-1;
        
        while (row < matrix.length && col>=0){
            if(matrix[row][col] == key){
                System.out.println("found at " +row+ " "+ col);
                return true;

            } else if (key < matrix[row][col]) {
                col --;

            } else {
                row ++;
            }
        }
        System.out.println("Key not found");
        return false;
        
        
    }


    public static void main(String[] args) {
        int matrix[][] = {{1 ,2 ,3 ,4},
                {5 ,6 ,7 ,8},
                {9 ,10 ,11 ,12},
                {13 ,14 ,15, 16}};

        int key =10;

        search(matrix , key);
    }
}
