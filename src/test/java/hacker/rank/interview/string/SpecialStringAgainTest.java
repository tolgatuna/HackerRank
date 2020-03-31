package hacker.rank.interview.string;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SpecialStringAgainTest {
    @Test
    public void testSubStrCount() {
        assertThat(SpecialStringAgain.substrCount(5, "asasd"), is(7L));
        assertThat(SpecialStringAgain.substrCount(7, "abcbaba"), is(10L));
        assertThat(SpecialStringAgain.substrCount(4, "aaaa"), is(10L));
        assertThat(SpecialStringAgain.substrCount(8, "mnonopoo"), is(12L));
        assertThat(SpecialStringAgain.substrCount(10, "mnoonoopoo"), is(17L));
    }
}