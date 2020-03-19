package algorithms.warmup;

import java.util.List;


public class DiagonalDifference {
    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        int sumLeft = 0;
        int sumRight = 0;
        for (int i = 0; i < arr.size(); i++) {
            sumLeft += arr.get(i).get(i);
            sumRight += arr.get(i).get(arr.size() - i - 1);
        }
        return Math.abs(sumLeft - sumRight);
    }
}
