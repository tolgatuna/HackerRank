package hacker.rank.interview.warmup;

public class RepeatedString {

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
}

