package hacker.rank.interview.greedy;

import java.util.Arrays;

public class MinimumAbsoluteDifferenceArray {

    static int minimumAbsoluteDifference(int[] arr) {
        Arrays.sort(arr);
        int minAbs = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            int abs = Math.abs(arr[i] - arr[i + 1]);
            if (abs < minAbs) {
                minAbs = abs;
            }
        }
        return minAbs;
    }

}
