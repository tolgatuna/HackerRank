package arrays.LeftRotation;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void testLeftRotation() {
        int arr[] = {1, 2, 3, 4, 5};
        int expected[] = {5, 1, 2, 3, 4};
        assertArrayEquals(expected, Solution.rotLeft(arr, 4));

    }
}