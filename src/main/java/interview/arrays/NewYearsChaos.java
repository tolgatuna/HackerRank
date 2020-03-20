package interview.arrays;

public class NewYearsChaos {

    static String minimumBribes(int[] q) {
        int count = 0;
        int length = q.length;
        int[] row = new int[length];
        for (int i = 0; i < length; i++) {
            row[i] = i + 1;
        }

        for (int i = 0; i < length; i++) {
            if (q[i] == row[i]) {
                continue;
            } else {
                if (i + 1 < length && q[i] == row[i + 1]) {
                    int temp = row[i + 1];
                    row[i + 1] = row[i];
                    row[i] = temp;
                    count++;
                } else if (i + 2 < length && q[i] == row[i + 2]) {
                    int temp = row[i + 2];
                    row[i + 2] = row[i + 1];
                    row[i + 1] = row[i];
                    row[i] = temp;
                    count += 2;
                } else {
                    return "Too chaotic";
                }
            }
        }

        return String.valueOf(count);
    }
}
