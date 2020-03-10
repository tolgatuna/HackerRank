package baeldung;

import org.hamcrest.Matchers;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CustomSetTest {

    @Test
    public void shouldReturnEmptyForNewCustomSet() {
        CustomSet<Object> customSet = new CustomSet();
        assertThat(customSet.isEmpty(), is(true));
    }

    @Test
    public void shouldReturnIsEmptyFalseWhenAnyItemAddedToCustomSet() {
        CustomSet<Object> customSet = new CustomSet();
        customSet.add(null);
        assertThat(customSet.isEmpty(), is(false));
    }

    @Test
    public void shouldReturnSizeAsOneWhenAnItemAddedToCustomSet() {
        CustomSet<Object> customSet = new CustomSet<>();
        customSet.add("test01");
        assertThat(customSet, Matchers.hasSize(1));
    }

    @Test
    public void shouldReturnSizeAsZeroWhenCustomSetCreated() {
        CustomSet<Object> customSet = new CustomSet<>();
        assertThat(customSet, Matchers.hasSize(0));
    }

    @Test
    public void shouldReturnTrueWhenAnyItemAddedToCustomSet() {
        CustomSet<Object> customSet = new CustomSet<>();
        assertThat(customSet.add(null), is(true));
    }

    @Test
    public void shouldReturnFalseWhenCustomSetDoesNotContainGivenItem() {
        CustomSet<Object> customSet = new CustomSet<>();
        assertThat(customSet.contains("Test"), is(false));
    }

    @Test
    public void shouldReturnTrueWhenCustomSetContainsGivenItem() {
        CustomSet<Object> customSet = new CustomSet<>();
        customSet.add("Test");
        assertThat(customSet.contains("Test"), is(true));
    }

    @Test
    public void shouldReturnTrueWhenCustomSetContainsAllForOneElement() {
        CustomSet<Object> customSet = new CustomSet<>();
        customSet.add("Test");
        Set<Object> set = new HashSet<>();
        set.add("Test");
        assertThat(customSet.containsAll(set), is(true));
    }

    @Test
    public void shouldReturnFalseWhenCustomSetDoesNotContainsAllElements() {
        CustomSet<Object> customSet = new CustomSet<>();
        customSet.add("Test02");
        Set<Object> set = new HashSet<>();
        set.add("Test01");
        assertThat(customSet.containsAll(set), is(false));
    }

    @Test
    public void shouldReturnSizeAsZeroWhenCustomSetClearCalled() {
        CustomSet<Object> customSet = new CustomSet<>();
        customSet.add("Test02");
        customSet.clear();
        assertThat(customSet, Matchers.hasSize(0));
    }

    @Test
    public void shouldReturnTrueWhenAnyElementRemoved() {
        CustomSet<Object> customSet = new CustomSet<>();
        customSet.add("Test02");
        assertThat(customSet, Matchers.hasSize(1));

        boolean success = customSet.remove("Test02");
        assertThat(customSet.isEmpty(), is(true));
        assertThat(success, is(true));

        ArrayList<Object> objects = new ArrayList<>(100);
        System.out.println(objects.size());
        objects.add("test");
        System.out.println(objects.size());
    }


}