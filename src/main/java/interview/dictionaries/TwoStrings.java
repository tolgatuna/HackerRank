package interview.dictionaries;

import java.util.Set;
import java.util.stream.Collectors;

public class TwoStrings {
    static String twoStrings(String s1, String s2) {

        Set<Character> collectS1 = s1.chars().mapToObj(e -> (char) e).collect(Collectors.toSet());
        Set<Character> collectS2 = s2.chars().mapToObj(e -> (char) e).collect(Collectors.toSet());

        for (Character character : collectS2) {
            if (collectS1.contains(character)) {
                return "YES";
            }
        }

        return "NO";
    }
}
