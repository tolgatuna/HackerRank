package hacker.rank.interview.greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LuckBalance {
    static int luckBalance(int k, int[][] contests) {
        List<Integer> importantContests = Arrays.stream(contests).filter(e -> e[1] == 1).map(e -> e[0]).collect(Collectors.toList());
        List<Integer> othersContests = Arrays.stream(contests).filter(e -> e[1] == 0).map(e -> e[0]).collect(Collectors.toList());
        Collections.sort(importantContests, Collections.reverseOrder());

        int sumOfImportantWithLoose = 0;
        int sumOfImportantWithWin = 0;
        int limit = 0;

        for (Integer importantContest : importantContests) {
            if (limit < k) {
                sumOfImportantWithLoose += importantContest;
                limit++;
            } else {
                sumOfImportantWithWin += importantContest;
            }
        }

        return othersContests.stream().reduce(Integer::sum).orElse(0) + sumOfImportantWithLoose - sumOfImportantWithWin;
    }
}
