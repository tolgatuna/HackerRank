package baeldung;

import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertThat;

public class AdvancedCustomSetTest {

    private AdvancedCustomSet<Object> customSet;

    @Before
    public void setUp() throws Exception {
        customSet = new AdvancedCustomSet();
    }

    @Test
    public void shouldReturnEmptyForNewCustomSet() {
        assertThat(customSet.isEmpty(), is(true));
    }

    @Test
    public void shouldReturnIsEmptyFalseWhenAnyItemAddedToCustomSet() {
        customSet.add("Test");
        assertThat(customSet.isEmpty(), is(false));
    }

    @Test
    public void shouldReturnSizeAsOneWhenAnItemAddedToCustomSet() {
        customSet.add("Test");
        assertThat(customSet, hasSize(1));
    }

    @Test
    public void shouldReturnSizeAsZeroWhenCustomSetCreated() {
        assertThat(customSet, hasSize(0));
    }

    @Test
    public void shouldReturnTrueWhenAnyItemAddedToCustomSet() {
        assertThat(customSet.add("Test"), is(true));
    }

    @Test
    public void shouldReturnFalseWhenCustomSetDoesNotContainGivenItem() {
        customSet = new AdvancedCustomSet<>();
        assertThat(customSet.contains("Test"), is(false));
    }

    @Test
    public void shouldReturnTrueWhenCustomSetContainsGivenItem() {
        customSet.add("Test");
        assertThat(customSet.contains("Test"), is(true));
    }

    @Test
    public void shouldReturnFalseWhenTryToAddSecondSameElementToCustomSetAndSizeShouldBeSameAsItIs() {
        customSet.add("Test");
        int currentSize = customSet.size();

        boolean secondItemAddedSuccess = customSet.add("Test");

        assertThat(secondItemAddedSuccess, is(false));
        assertThat(customSet.size(), is(currentSize));
    }

    @Test
    public void shouldReturnTrueWhenCustomSetContainsAllForOneElement() {
        customSet.add("Test01");
        customSet.add("Test02");
        customSet.add("Test03");

        Set<Object> set = new HashSet<>();
        set.add("Test01");
        set.add("Test02");

        assertThat(customSet.containsAll(set), is(true));
    }

    @Test
    public void shouldReturnFalseWhenCustomSetDoesNotContainsAllElements() {
        customSet.add("Test02");
        Set<Object> set = new HashSet<>();
        set.add("Test01");
        assertThat(customSet.containsAll(set), is(false));
    }

    @Test
    public void shouldReturnSizeAsZeroWhenCustomSetClearCalled() {
        customSet.add("Test02");
        customSet.clear();
        assertThat(customSet, hasSize(0));
        assertThat(customSet.isEmpty(), is(true));
    }

    @Test
    public void shouldReturnTrueWhenAnyElementRemoved() {
        customSet.add("Test01");
        customSet.add("Test02");
        assertThat(customSet, hasSize(2));

        boolean success = customSet.remove("Test02");
        assertThat(success, is(true));
        assertThat(customSet, hasSize(1));
    }

    @Test
    public void shouldReturnFalseWhenTryToRemoveNonExistElement() {
        customSet.add("Test01");
        customSet.add("Test02");
        assertThat(customSet, hasSize(2));

        boolean success = customSet.remove("NONEXIST");
        assertThat(success, is(false));
        assertThat(customSet, hasSize(2));
    }

    @Test
    public void shouldNotFailTryToAddThreeElementsForCreatedCustomSetForLengthTwo() {
        AdvancedCustomSet<Object> customSet = new AdvancedCustomSet<>(2);
        customSet.add("Test01");
        customSet.add("Test02");
        customSet.add("Test03");
        assertThat(customSet, hasSize(3));
    }
}