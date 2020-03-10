package warmup.JumpingOnTheClouds;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void shouldReturnThreeForGivenCloudArray() {
        int arr[] = {0, 0, 0, 0, 1, 0};
        assertEquals(3, Solution.jumpingOnClouds(arr));
    }

    @Test
    public void shouldReturnThreeForGivenCloudArrayAlso() {
        int arr[] = {0, 0, 0, 1, 0, 0};
        assertEquals(3, Solution.jumpingOnClouds(arr));
    }
}