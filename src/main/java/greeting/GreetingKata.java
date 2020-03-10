package testdouble;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GreetingKata {
    public String greet(String... name) {

        if (name == null) {
            return "Hello, my friend";
        }

        StringBuilder greeting = new StringBuilder();
        List<String> upperCaseNames = new ArrayList<>();
        List<String> lowerCaseNames = new ArrayList<>();

        Arrays.asList(name).stream()
                .map(s -> {
                    if (!s.startsWith("\""))
                        return s.split(", ");
                    else
                        return new String[]{s.replaceAll("\"", "")};
                })
                .flatMap(Arrays::stream)
                .forEach(s -> {
                    if (isUpperCase(s)) {
                        upperCaseNames.add(s);
                    } else {
                        lowerCaseNames.add(s);
                    }
                });

        if (lowerCaseNames.size() > 0) {
            greeting.append("Hello, ");
            greeting.append(addNames(lowerCaseNames, false));
            if (upperCaseNames.size() > 0) {
                greeting.append(" AND HELLO ");
                greeting.append(addNames(upperCaseNames, true));
            }
        } else if (upperCaseNames.size() > 0) {
            greeting.append("HELLO ");
            greeting.append(addNames(upperCaseNames, true));
        }

        return greeting.toString();
    }

    private String addNames(List<String> nameList, boolean isUpperCase) {
        StringBuilder namesStr = new StringBuilder();
        int size = nameList.size();
        for (int i = 0; i < size; i++) {
            namesStr.append(nameList.get(i));
            if (i != size - 1) {
                if (i != size - 1 && size > 2) {
                    namesStr.append(", ");
                } else {
                    namesStr.append(" ");
                }
                if (i == size - 2) {
                    namesStr.append(isUpperCase ? "AND " : "and ");
                }
            }
        }
        namesStr.append(isUpperCase ? "!" : ".");
        return namesStr.toString();
    }

    private static boolean isUpperCase(String s) {
        return s.toUpperCase().equals(s);
    }
}
