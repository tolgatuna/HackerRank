package hacker.rank.interview.greedy;

import org.junit.Test;

import static hacker.rank.interview.greedy.MinimumAbsoluteDifferenceArray.minimumAbsoluteDifference;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MinimumAbsoluteDifferenceArrayTest {
    @Test
    public void testMinimumAbsoluteDifference() {
        assertThat(minimumAbsoluteDifference(new int[]{3, -7, 0}), is(3));
        assertThat(minimumAbsoluteDifference(new int[]{-59, -36, -13, 1, -53, -92, -2, -96, -54, 75}), is(1));
    }
}