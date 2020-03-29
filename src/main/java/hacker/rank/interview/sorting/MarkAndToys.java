package hacker.rank.interview.sorting;

import java.util.Arrays;

public class MarkAndToys {
    // Complete the maximumToys function below.
    static int maximumToys(int[] prices, int k) {
        Arrays.sort(prices);

        int count = 0;
        int total = 0;
        for (int price : prices) {
            if (price + total <= k) {
                total += price;
                count++;
            }
        }
        return count;
    }
}
