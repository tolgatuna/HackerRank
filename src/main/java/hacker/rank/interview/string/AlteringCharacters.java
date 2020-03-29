package hacker.rank.interview.string;

public class AlteringCharacters {
    static int alternatingCharacters(String s) {
        char[] chars = s.toCharArray();
        int count = 0;
        char current = chars[0];
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == current) {
                count++;
            } else {
                current = chars[i];
            }
        }
        return count;
    }
}
