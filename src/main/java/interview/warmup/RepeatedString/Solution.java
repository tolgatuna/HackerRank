package interview.warmup.RepeatedString;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

    static long repeatedString(String s, long n) {
        long count = 0;
        long length = s.length();

        count = getCountForGivenString(s, count, length);

        long multiplier = n / length;
        count = count * multiplier;
        length = length * multiplier;

        count = getCountForGivenString(s, count, n - length);

        return count++;
    }

    private static long getCountForGivenString(String s, long count, long length) {
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == 'a') {
                count++;
            }
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

