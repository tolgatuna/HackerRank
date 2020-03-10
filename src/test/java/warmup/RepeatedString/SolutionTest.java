package warmup.RepeatedString;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void repeatedStringTest() {
        assertEquals(7, Solution.repeatedString("aba", 10));
        assertEquals(1000000000000L, Solution.repeatedString("a", 1000000000000L));
    }
}