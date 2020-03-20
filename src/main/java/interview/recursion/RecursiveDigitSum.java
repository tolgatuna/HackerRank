package interview.recursion;

public class RecursiveDigitSum {
    // Complete the superDigit function below.
    static int superDigit(String n, int k) {
        if (n.length() == 1) {
            if (k == 1) {
                return Integer.parseInt(n);
            } else {
                int newIntVal = Integer.parseInt(n) * k;
                return superDigit(String.valueOf(newIntVal), 1);
            }
        } else {
            int sum = 0;
            for (int i = 0; i < n.length(); i++) {
                sum += Integer.parseInt(String.valueOf(n.charAt(i)));
            }
            return superDigit(String.valueOf(sum), k);
        }
    }
}
