package Array;

public class updateArrayValueinFunction {

    public static void update(int marks[]){
        for (int i = 0; i <marks.length ; i++) {
            marks[i] = marks[i] +1;
        }
    }

    public static void main(String[] args) {
        int num[] = {39 ,12,34};
        update(num);
        for (int i = 0; i <num.length ; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }
}
