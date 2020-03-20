package interview.warmup;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountingValleysTest {

    @Test
    public void shouldReturnOneForGivenPath() {
        String s = "UDDDUDUU";
        assertEquals(1, CountingValleys.countingValleys(8, s));
    }

    @Test
    public void shouldReturnTwoForGivenPath() {
        String s = "DDUUDDUDUUUD";
        assertEquals(2, CountingValleys.countingValleys(12, s));
    }
}