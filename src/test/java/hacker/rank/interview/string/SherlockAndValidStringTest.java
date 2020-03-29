package hacker.rank.interview.string;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SherlockAndValidStringTest {
    @Test
    public void testStringValid() {
        assertThat(SherlockAndValidString.isValid("abc"), is("YES"));
        assertThat(SherlockAndValidString.isValid("aaaaaa"), is("YES"));
        assertThat(SherlockAndValidString.isValid("abcc"), is("YES"));
        assertThat(SherlockAndValidString.isValid("aabbcd"), is("NO"));
        assertThat(SherlockAndValidString.isValid("aabbccddeefghi"), is("NO"));
        assertThat(SherlockAndValidString.isValid("abcdefghhgfedecba"), is("YES"));
        assertThat(SherlockAndValidString.isValid("aabbc"), is("YES"));
        assertThat(SherlockAndValidString.isValid("aaaabbbbccccd"), is("YES"));
    }
}