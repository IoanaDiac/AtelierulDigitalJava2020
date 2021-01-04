package lab6.Ch2PascalTriangle;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PascalTriangle(8);
    }

    public static void PascalTriangle(int n) {
        int[][] triangle = new int[n][n];


        for (int line = 0; line < n; line++) {
            // Every line has number of integers equal to line number
            for (int i = 0; i <= line; i++) {
                // First and last values in every row are 1
                if (line == i || i == 0)
                    triangle[line][i] = 1;
                else // Other values are sum of values just above and left of above
                    triangle[line][i] = triangle[line - 1][i - 1] + triangle[line - 1][i];
                System.out.print(triangle[line][i]);
            }
            System.out.println("");
        }
    }


}
