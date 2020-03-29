package hacker.rank.interview.sorting;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class MarkAndToysTest {
    @Test
    public void testMaximumToysCount() {
        assertThat(MarkAndToys.maximumToys(new int[]{1, 12, 5, 111, 200, 1000, 10}, 50), CoreMatchers.is(4));
        assertThat(MarkAndToys.maximumToys(new int[]{1, 2, 3, 4}, 7), CoreMatchers.is(3));
    }
}