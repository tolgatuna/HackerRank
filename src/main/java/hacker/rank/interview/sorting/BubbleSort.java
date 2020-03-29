package hacker.rank.interview.sorting;

public class BubbleSort {

    // Complete the countSwaps function below.
    static void countSwaps(int[] a) {
        int swapCount = bubbleSort(a);
        System.out.println(String.format("Array is sorted in %d swaps.", swapCount));
        System.out.println(String.format("First Element: %d", a[0]));
        System.out.print(String.format("Last Element: %d", a[a.length - 1]));
    }

    static int bubbleSort(int[] a) {
        int n = a.length;
        int swapCount = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) {
                    swapCount++;
                    swap(a, j, j + 1);
                }
            }
        }
        return swapCount;
    }

    private static void swap(int[] a, int first, int second) {
        int temp = a[first];
        a[first] = a[second];
        a[second] = temp;
    }
}
