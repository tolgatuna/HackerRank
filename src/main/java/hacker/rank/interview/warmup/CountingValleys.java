package hacker.rank.interview.warmup;

public class CountingValleys {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int currentState = 0;
        int valleyCounter = 0;
        boolean isEnteredValley = false;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'U') {
                if (++currentState >= 0) {
                    isEnteredValley = false;
                }
            } else {
                currentState--;
                if (!isEnteredValley && currentState < 0) {
                    isEnteredValley = true;
                    valleyCounter++;
                }
            }
        }
        return valleyCounter;
    }
}

