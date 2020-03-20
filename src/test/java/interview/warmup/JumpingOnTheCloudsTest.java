package interview.warmup;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JumpingOnTheCloudsTest {

    @Test
    public void shouldReturnThreeForGivenCloudArray() {
        int arr[] = {0, 0, 0, 0, 1, 0};
        assertEquals(3, JumpingOnTheClouds.jumpingOnClouds(arr));
    }

    @Test
    public void shouldReturnThreeForGivenCloudArrayAlso() {
        int arr[] = {0, 0, 0, 1, 0, 0};
        assertEquals(3, JumpingOnTheClouds.jumpingOnClouds(arr));
    }
}