package interview.string;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MakingAnagramsTest {

    @Test
    public void testMakingAnagramsMethodForGivenStrings() {
        assertThat(MakingAnagrams.makeAnagram("cde", "abc"), is(4));
        assertThat(MakingAnagrams.makeAnagram("fcrxzwscanmligyxyvym", "jxwtrhvujlmrpdoqbisbwhmgpmeoke"), is(30));
        assertThat(MakingAnagrams.makeAnagram("showman", "woman"), is(2));
    }
}