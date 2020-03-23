package hacker.rank.interview.array;

public class LeftRotation {

    static int[] rotLeft(int[] a, int d) {
        int lengthOfArr = a.length;
        int[] newArr = new int[lengthOfArr];
        for (int i = 0; i < lengthOfArr; i++) {
            newArr[i - d >= 0 ? i - d : i - d + lengthOfArr] = a[i];
        }

        return newArr;
    }
}
