package hacker.rank.interview.array;

import org.hamcrest.Matchers;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class NewYearsChaosTest {

    @Test
    public void testMinimumBribes01_1() {
        int arr[] = {2, 1, 5, 3, 4};
        assertThat(NewYearsChaos.minimumBribes(arr), Matchers.is("3"));
    }

    @Test
    public void testMinimumBribes01_2() {
        int arr[] = {2, 5, 1, 3, 4};
        assertThat(NewYearsChaos.minimumBribes(arr), Matchers.is("Too chaotic"));
    }

    @Test
    public void testMinimumBribes02_1() {
        int arr[] = {1, 2, 5, 3, 7, 8, 6, 4};

        assertThat(NewYearsChaos.minimumBribes(arr), Matchers.is("7"));
    }
}