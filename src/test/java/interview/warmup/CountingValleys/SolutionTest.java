package interview.warmup.CountingValleys;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void shouldReturnOneForGivenPath() {
        String s = "UDDDUDUU";
        assertEquals(1, Solution.countingValleys(8, s));
    }

    @Test
    public void shouldReturnTwoForGivenPath() {
        String s = "DDUUDDUDUUUD";
        assertEquals(2, Solution.countingValleys(12, s));
    }
}