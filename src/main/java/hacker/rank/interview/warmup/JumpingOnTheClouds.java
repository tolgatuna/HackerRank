package hacker.rank.interview.warmup;

public class JumpingOnTheClouds {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int count = 0;
        int length = c.length;

        for (int i = 0; i < length; i++) {
            if (i != 0) count++;
            if (i + 2 < length && c[i + 2] == 0) i++;
        }
        return count;
    }
}
