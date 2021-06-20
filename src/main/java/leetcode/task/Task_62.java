package leetcode.task;

import java.util.stream.LongStream;

/**
 * Problem #62 leetcode.com
 * <p>
 * A robot is located at the top-left corner of a m x n grid.
 * The robot can only move either down or right at any point in time.
 * The robot is trying to reach the bottom-right corner of the grid.
 * <p>
 * How many possible unique paths are there?
 */
public class Task_62 {

    public int uniquePaths(int m, int n) {
        int max = Math.max(m, n);
        int min = Math.min(m, n);
        return (int) (factorial(max, m + n - 2) / factorial(1, min - 1));
    }

    private long factorial(int start, int n) {
        return LongStream.rangeClosed(start, n).reduce(1, (x, y) -> x * y);
    }
}
