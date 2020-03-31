package hacker.rank.interview.string;

import java.math.BigInteger;

public class SpecialStringAgain {
    // Complete the substrCount function below.
    static long substrCount(int n, String s) {
        long countMatches = 0L;

        char[] chars = s.toCharArray();
        char current = chars[0];
        int startedPoint = 0, midPoint = -1, endPoint = -1;

        for (int i = 1; i < n; i++) {
            if (current == chars[i]) {
                endPoint = i;
            } else {
                if (midPoint == -1) {
                    if (i + 1 < n) {
                        if (current == chars[i + 1]) {
                            midPoint = i;
                        } else {
                            countMatches += calculateSubCountMatches(startedPoint, midPoint, endPoint, false);
                            startedPoint = i;
                            current = chars[i];
                            endPoint = -1;
                        }
                    } else {
                        countMatches += calculateSubCountMatches(startedPoint, midPoint, endPoint, false);
                        startedPoint = i;
                        current = chars[i];
                        endPoint = -1;
                    }
                } else {
                    countMatches += calculateSubCountMatches(startedPoint, midPoint, endPoint, false);
                    if (endPoint - midPoint > 1) {
                        i = midPoint + 1;
                    } else {
                        i = midPoint;
                    }
                    startedPoint = i;
                    current = chars[i];
                    midPoint = -1;
                    endPoint = -1;
                }
            }
        }

        countMatches += calculateSubCountMatches(startedPoint, midPoint, endPoint, true);
        return countMatches + n;
    }

    private static int calculateSubCountMatches(int startedPoint, int midPoint, int endPoint, boolean isLast) {
        if (midPoint != -1) {
            int startToMid = midPoint - startedPoint;
            int midToEnd = endPoint - midPoint;
            int startToMidCount = startToMid > 1 ? calculateCombination(startToMid, 2) : 0;
            int midToEndCount = isLast ? midToEnd > 1 ? calculateCombination(midToEnd, 2) : 0 : 0;
            int countWithMidCount = midToEnd < startToMid ? midToEnd : startToMid;
            return startToMidCount + midToEndCount + countWithMidCount;
        } else {
            if (endPoint - startedPoint > 0) {
                return calculateCombination(endPoint - startedPoint + 1, 2);
            } else {
                return 0;
            }
        }
    }

    private static int calculateCombination(int n, int r) {
        if (n < r) return 0;
        return factorial(n).divide(factorial(r).multiply(factorial(n - r))).intValue();
    }

    private static BigInteger factorial(int n) {
        return (n == 1 || n == 0) ? BigInteger.ONE : BigInteger.valueOf(n).multiply(factorial(n - 1));
    }
}
