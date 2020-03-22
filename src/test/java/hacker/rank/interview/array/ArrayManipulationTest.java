package hacker.rank.interview.array;

import org.hamcrest.Matchers;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class ArrayManipulationTest {
    @Test
    public void testArrayManipulation() {
        int[][] queries = {
                {1, 5, 3},
                {4, 8, 7},
                {6, 9, 1}
        };
        long result = ArrayManipulation.arrayManipulation(10, queries);
        assertThat(result, Matchers.is(10L));
    }

    @Test
    public void testArrayManipulationForSecondCase() {
        int[][] queries = {
                {2, 6, 8},
                {3, 5, 7},
                {1, 8, 1},
                {5, 9, 15}
        };
        long result = ArrayManipulation.arrayManipulation(10, queries);
        assertThat(result, Matchers.is(31L));
    }
}