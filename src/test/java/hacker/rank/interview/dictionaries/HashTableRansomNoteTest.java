package hacker.rank.interview.dictionaries;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class HashTableRansomNoteTest {
    @Test
    public void shouldReturnYesForGivenText() {
        String magazine[] = {"give", "me", "one", "grand", "today", "night"};
        String note[] = {"give", "one", "grand", "today"};
        assertThat(HashTableRansomNote.checkMagazine(magazine, note), is("YES"));
    }

    @Test
    public void shouldReturnNoForGivenText() {
        String magazine[] = {"two", "times", "three", "is", "not", "four"};
        String note[] = {"two", "times", "two", "is", "four"};
        assertThat(HashTableRansomNote.checkMagazine(magazine, note), is("NO"));
    }

}