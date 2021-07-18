package leetcode.task;

import java.util.Arrays;

/**
 * Problem #48 leetcode.com
 *
 * You are given an n x n 2D matrix representing an image,
 * rotate the image by 90 degrees (clockwise).
 */

public class Task_48 {

    public void rotate(int[][] matrix) {
        int rows = matrix.length;
        if (rows == 0) {
            return;
        }
        int columns = matrix[0].length;
        if (columns != rows) {
            return;
        }
        for (int i = 0; i < rows / 2; i++) {
            for (int j = i; j < columns - i - 1; j++) {
                int m1 = matrix[i][j];
                int m2 = matrix[j][columns - i - 1];
                int m3 = matrix[rows - i - 1][rows - j - 1];
                int m4 = matrix[columns - j - 1][i];

                matrix[i][j] = m4;
                matrix[columns - j - 1][i] = m3;
                matrix[rows - i - 1][rows - j - 1] = m2;
                matrix[j][columns - i - 1] = m1;
            }
        }
    }

    private void printMatrix(int[][] matrix) {
        for (int[] row: matrix) {
            System.out.println(Arrays.toString(row));
        }
    }


}
