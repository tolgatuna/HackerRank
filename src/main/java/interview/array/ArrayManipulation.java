package interview.array;

import java.util.Arrays;

public class ArrayManipulation {

    /*
        How it is working?
                n       = 10
                queries = {1, 5, 3},
                          {4, 8, 7},
                          {6, 9, 1}

        Solution
                 i =  0  1  2   3   4   5  6  7   8   9  10
               arr = [0, 0, 0,  0,  0,  0, 0, 0,  0,  0, 0]
    step (1, 5, 3) = [3, 0, 0,  0,  0, -3, 0, 0,  0,  0, 0]
    step (4, 8, 7) = [3, 0, 0,  7,  0, -3, 0, 0, -7,  0, 0]
    step (6, 9, 1) = [3, 0, 0,  7,  0, -2, 0, 0, -7, -1, 0]
        prefix sum = [3, 3, 3, 10, 10,  8, 8, 9,  1,  0, 0]

        Which is exactly same with the examples in problem
        index->	 1 2 3  4  5 6 7 8 9  10
                [0,0,0, 0, 0,0,0,0,0, 0]
                [3,3,3, 3, 3,0,0,0,0, 0]
                [3,3,3,10,10,7,7,7,0, 0]
                [3,3,3,10,10,8,8,8,1, 0]
     */

    static long arrayManipulation(int n, int[][] queries) {
        int length = queries.length;
        long[] arr = new long[n + 1];
        for (int i = 0; i < length; i++) {
            int start = queries[i][0] - 1; //Index starting from 1 in examples!
            int end = queries[i][1];       //I did not touch in here because it should plus one if the index starts from 0 as i did
            int sumVal = queries[i][2];

            arr[start] = arr[start] + sumVal;
            arr[end] = arr[end] - sumVal;
        }

        applyPrefixSum(arr);
        return findMax(arr);
    }

    private static void applyPrefixSum(long[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }
    }

    private static long findMax(long[] arr) {
        return Arrays.stream(arr).max().getAsLong();
    }
}
