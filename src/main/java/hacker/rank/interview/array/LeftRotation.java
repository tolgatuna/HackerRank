package hacker.rank.interview.array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LeftRotation {

    static int[] rotLeft(int[] a, int d) {
        List<Integer> arrList = Arrays.stream(a).boxed().collect(Collectors.toList());

        for (int i = 0; i < d; i++) {
            Integer temp = arrList.get(0);
            arrList.remove(0);
            arrList.add(temp);
        }

        return arrList.stream().mapToInt(i -> i).toArray();
    }
}
