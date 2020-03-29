package hacker.rank.interview.sorting;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BubbleSortTest {
    @Test
    public void testBubbleSortResults() {
        int[] a = {3, 2, 1};
        int swapCount = BubbleSort.bubbleSort(a);
        assertThat(a, is(new int[]{1, 2, 3}));
        assertThat(swapCount, is(3));
    }
}