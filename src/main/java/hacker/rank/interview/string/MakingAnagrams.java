package hacker.rank.interview.string;

import java.util.List;
import java.util.stream.Collectors;

public class MakingAnagrams {
    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {
        List<Character> listA = a.chars().mapToObj(e -> (char) e).collect(Collectors.toList());
        List<Character> listB = b.chars().mapToObj(e -> (char) e).collect(Collectors.toList());

        int size = listA.size();
        for (int i = size - 1; i >= 0; i--) {
            Character character = listA.get(i);
            if (listB.contains(character)) {
                listA.remove(i);
                listB.remove(character);
            }
        }

        return listA.size() + listB.size();
    }
}
