package hacker.rank.interview.array;

public class Array2D {

    static int hourglassSum(int[][] arr) {
        int sum = Integer.MIN_VALUE;
        int temp = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                temp = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] +
                        arr[i + 1][j + 1] +
                        arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                if (temp > sum) {
                    sum = temp;
                }
            }
        }
        return sum;
    }
}