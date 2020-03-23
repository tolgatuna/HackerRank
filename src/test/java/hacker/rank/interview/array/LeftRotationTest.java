package hacker.rank.interview.array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class LeftRotationTest {
    @Test
    public void testLeftRotation() {
        int arr[] = {1, 2, 3, 4, 5};
        int expected[] = {5, 1, 2, 3, 4};

        assertArrayEquals(expected, LeftRotation.rotLeft(arr, 4));
    }
}