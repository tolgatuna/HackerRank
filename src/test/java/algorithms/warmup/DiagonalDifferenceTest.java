package algorithms.warmup;

import org.hamcrest.Matchers;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

public class DiagonalDifferenceTest {

    @Test
    public void diagonalDifference() {
        ArrayList<List<Integer>> lists = new ArrayList<>();
        lists.add(Arrays.asList(11, 2, 4));
        lists.add(Arrays.asList(4, 5, 6));
        lists.add(Arrays.asList(10, 8, -12));
        int i = DiagonalDifference.diagonalDifference(lists);

        assertThat(i, Matchers.is(15));
    }
}