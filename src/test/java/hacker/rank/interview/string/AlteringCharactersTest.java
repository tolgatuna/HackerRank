package hacker.rank.interview.string;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class AlteringCharactersTest {
    @Test
    public void testAlteringCharacters() {
        assertThat(AlteringCharacters.alternatingCharacters("AAAA"), is(3));
        assertThat(AlteringCharacters.alternatingCharacters("BBBBB"), is(4));
        assertThat(AlteringCharacters.alternatingCharacters("ABABABAB"), is(0));
        assertThat(AlteringCharacters.alternatingCharacters("BABABA"), is(0));
        assertThat(AlteringCharacters.alternatingCharacters("AAABBB"), is(4));

    }
}