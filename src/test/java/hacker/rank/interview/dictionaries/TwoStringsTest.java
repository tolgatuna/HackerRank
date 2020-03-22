package hacker.rank.interview.dictionaries;

import org.hamcrest.Matchers;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class TwoStringsTest {
    @Test
    public void shouldReturnYesIfTwoStringsHaveCommonSubstring() {

        assertThat(TwoStrings.twoStrings("a", "art"), Matchers.is("YES"));
    }

    @Test
    public void shouldReturnNoIfTwoStringsNotHaveCommonSubstring() {
        assertThat(TwoStrings.twoStrings("be", "cat"), Matchers.is("NO"));
    }
}