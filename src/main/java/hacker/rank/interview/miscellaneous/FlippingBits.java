package hacker.rank.interview.miscellaneous;

public class FlippingBits {
    static long flippingBits(long n) {
        char[] chars = new char[32];

        char[] numberChars = Long.toBinaryString(n).toCharArray();
        // 1, 0
        for (int i = chars.length - 1; i >= 0; i--) {
            if (i >= chars.length - numberChars.length) {
                chars[i] = numberChars[i - (chars.length - numberChars.length)] == '1' ? '0' : '1';
            } else {
                chars[i] = '1';
            }
        }
        return Long.parseLong(String.valueOf(chars), 2);
    }

}
