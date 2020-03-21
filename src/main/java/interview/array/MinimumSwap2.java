package interview.array;

public class MinimumSwap2 {
    static int minimumSwaps(int[] arr) {
        int swapCount = 0;
        int length = arr.length;
        int[] arrOrder = new int[length + 1];
        for (int i = 0; i < arr.length; i++) {
            arrOrder[arr[i]] = i;
        }

        for (int i = 0; i < length; i++) {
            if (arr[i] == i + 1) {
                continue;
            } else {
                swapCount++;
                int actualElementIndex = arrOrder[i + 1];
                int actualElementValue = i + 1;
                int swappedElementValue = arr[i];
                int swappedElementIndex = i;

                swapElements(arrOrder, actualElementValue, swappedElementValue);
                swapElements(arr, swappedElementIndex, actualElementIndex);
            }
        }
        return swapCount;
    }

    private static void swapElements(int[] arr, int i1, int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
}
