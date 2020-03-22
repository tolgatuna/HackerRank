package hacker.rank.interview.warmup;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RepeatedStringTest {

    @Test
    public void repeatedStringTest() {
        assertEquals(7, RepeatedString.repeatedString("aba", 10));
        assertEquals(1000000000000L, RepeatedString.repeatedString("a", 1000000000000L));
    }
}