package hacker.rank.interview.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SherlockAndValidString {
    static String isValid(String s) {
        char[] chars = s.toCharArray();
        Map<Character, Integer> charactersCount = new HashMap<>();
        for (int i = 0; i < chars.length; i++)
            charactersCount.put(chars[i], charactersCount.getOrDefault(chars[i], 0) + 1);


        List<Integer> values = new ArrayList<>(charactersCount.values());
        boolean isValid = true;
        if (values.size() > 1) {
            Integer min = values.stream().min(Integer::compareTo).get();
            Integer max = values.stream().max(Integer::compareTo).get();

            if (max.equals(min)) {
                isValid = true;
            } else if (min == 1) {
                List<Integer> filteredVal = values.stream().filter(integer -> integer != 1).collect(Collectors.toList());
                if (values.size() - filteredVal.size() == 1) {
                    values = filteredVal;
                    min = values.stream().min(Integer::compareTo).get();
                    if (min != max) {
                        isValid = false;
                    }
                } else {
                    isValid = checkValidationWithRemove(values, min);
                }
            } else if (max - min == 1) {
                isValid = checkValidationWithRemove(values, min);
            } else {
                isValid = false;
            }
        }

        return isValid ? "YES" : "NO";
    }

    private static boolean checkValidationWithRemove(List<Integer> values, Integer min) {
        boolean isAnyRemoved = false;
        boolean isValid;
        isValid = true;
        for (Integer value : values) {
            if (value != min) {
                if (value - min == 1) {
                    if (!isAnyRemoved) {
                        isAnyRemoved = true;
                    } else {
                        isValid = false;
                        break;
                    }
                } else {
                    isValid = false;
                    break;
                }
            }
        }
        return isValid;
    }
}
