package Patterns;

public class HalfPyramidPattern {
    public static void main(String[] args) {
        for (int line = 1; line <= 4 ; line++) {
            for (int no = 1; no <=line ; no++) {
                System.out.print(no);

            }
            System.out.println();
        }
    }
}
