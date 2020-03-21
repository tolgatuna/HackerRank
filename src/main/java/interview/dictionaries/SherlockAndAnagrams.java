package interview.dictionaries;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SherlockAndAnagrams {
    static int sherlockAndAnagrams(String s) {
        Map<String, Integer> myMap = new HashMap<>();

        int currentLength = 1;
        while (currentLength < s.length()) {
            for (int i = 0; i < s.length(); i++) {
                if (i + currentLength <= s.length()) {
                    String searchString = reOrderCharacters(s.substring(i, i + currentLength));
                    myMap.put(searchString, myMap.getOrDefault(searchString, 0) + 1);
                }

            }
            currentLength++;
        }

        return myMap.values().stream().map(e -> calculateCombination(e, 2)).reduce(0, Integer::sum);
    }

    private static String reOrderCharacters(String s) {
        char tempArray[] = s.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }

    private static int calculateCombination(int n, int r) {
        if (n < r) return 0;
        return factorial(n).divide(factorial(r).multiply(factorial(n - r))).intValue();
    }

    private static BigInteger factorial(int n) {
        return (n == 1 || n == 0) ? BigInteger.ONE : BigInteger.valueOf(n).multiply(factorial(n - 1));
    }
}
