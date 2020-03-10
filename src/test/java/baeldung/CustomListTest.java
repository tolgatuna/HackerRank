package baeldung;

import org.hamcrest.Matchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class CustomListTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void givenEmptyList_whenIsEmpty_thenTrueIsReturned() {
        List<Object> list = new CustomList<>();

        assertThat(list.isEmpty(), is(true));
    }

    @Test
    public void givenNonEmptyList_whenIsEmpty_thenFalseIsReturned() {
        List<Object> list = new CustomList<>();
        list.add(null);

        assertThat(list.isEmpty(), is(not(true)));
    }

    @Test
    public void givenListWithAnElement_whenSize_thenOneIsReturned() {
        List<Object> list = new CustomList<>();
        list.add(null);

        assertThat(list.size(), is(1));
    }

    @Test
    public void givenListWithNoElements_whenSize_thenZeroIsReturned() {
        List<Object> list = new CustomList<>();

        assertThat(list.size(), is(0));
    }

    @Test
    public void givenListWithAnElement_whenGet_thenThatElementIsReturned() {
        List<Object> list = new CustomList<>();
        list.add("baeldung");
        Object element = list.get(0);

        assertThat(element, is("baeldung"));
    }

    @Test
    public void givenEmptyList_whenElementIsAdded_thenGetReturnsThatElement() {
        List<Object> list = new CustomList<>();
        boolean succeeded = list.add(null);

        assertThat(succeeded, is(true));
    }

    @Test
    public void givenListWithAnElement_whenAnotherIsAdded_thenGetReturnsBoth() {
        List<Object> list = new CustomList<>();
        list.add("baeldung");
        list.add(".com");
        Object element1 = list.get(0);
        Object element2 = list.get(1);

        assertThat(element1, is("baeldung"));
        assertThat(element2, is(".com"));
    }

    @Test
    public void whenAddToSpecifiedIndex_thenExceptionIsThrown() {
        expectedException.expect(UnsupportedOperationException.class);
        expectedException.expectMessage("Unsupported Operation for add!");
        new CustomList<>().add(0, null);
    }

    @Test
    public void whenAddAllToTheEnd_thenExceptionIsThrown() {
        expectedException.expect(UnsupportedOperationException.class);
        expectedException.expectMessage("Unsupported Operation for addAll!");
        Collection<Object> collection = new ArrayList<>();
        List<Object> list = new CustomList<>();
        list.addAll(collection);
    }

    @Test
    public void whenAddAllToSpecifiedIndex_thenExceptionIsThrown() {
        expectedException.expect(UnsupportedOperationException.class);
        expectedException.expectMessage("Unsupported Operation for addAll!");
        Collection<Object> collection = new ArrayList<>();
        List<Object> list = new CustomList<>();
        list.addAll(0, collection);
    }

    @Test
    public void whenRemoveAtSpecifiedIndex_thenExceptionIsThrown() {
        expectedException.expect(UnsupportedOperationException.class);
        expectedException.expectMessage("Unsupported Operation for remove!");
        List<Object> list = new CustomList<>();
        list.add("baeldung");
        list.remove(0);
    }

    @Test
    public void whenRemoveSpecifiedElement_thenExceptionIsThrown() {
        expectedException.expect(UnsupportedOperationException.class);
        expectedException.expectMessage("Unsupported Operation for remove with value!");
        List<Object> list = new CustomList<>();
        list.add("baeldung");
        list.remove("baeldung");
    }

    @Test
    public void whenRemoveAll_thenExceptionIsThrown() {
        expectedException.expect(UnsupportedOperationException.class);
        expectedException.expectMessage("Unsupported Operation for removeAll!");
        Collection<Object> collection = new ArrayList<>();
        collection.add("baeldung");
        List<Object> list = new CustomList<>();
        list.removeAll(collection);
    }

    @Test
    public void whenRetainAll_thenExceptionIsThrown() {
        expectedException.expect(UnsupportedOperationException.class);
        expectedException.expectMessage("Unsupported Operation for retainAll!");
        Collection<Object> collection = new ArrayList<>();
        collection.add("baeldung");
        List<Object> list = new CustomList<>();
        list.add("baeldung");
        list.retainAll(collection);
    }

    @Test
    public void givenEmptyList_whenContains_thenFalseIsReturned() {
        List<Object> list = new CustomList<>();

        assertThat(list.contains(null), is(false));
    }

    @Test
    public void givenListWithAnElement_whenContains_thenTrueIsReturned() {
        List<Object> list = new CustomList<>();
        list.add("baeldung");

        assertThat(list.contains("baeldung"), is(true));
    }

    @Test
    public void givenListWithAnElement_whenContainsAll_thenTrueIsReturned() {
        Collection<Object> collection = new ArrayList<>();
        collection.add("baeldung");
        List<Object> list = new CustomList<>();
        list.add("baeldung");

        assertThat(list.containsAll(collection), is(true));
    }

    @Test
    public void givenList_whenContainsAll_thenEitherTrueOrFalseIsReturned() {
        Collection<Object> collection1 = new ArrayList<>();
        collection1.add("baeldung");
        collection1.add(".com");
        Collection<Object> collection2 = new ArrayList<>();
        collection2.add("baeldung");

        List<Object> list = new CustomList<>();
        list.add("baeldung");

        assertThat(list.containsAll(collection1), is(false));
        assertThat(list.containsAll(collection2), is(true));
    }

    @Test
    public void givenList_whenSet_thenOldElementIsReturned() {
        List<Object> list = new CustomList<>();
        list.add("baeldung");
        Object element = list.set(0, null);

        assertThat(element, is("baeldung"));
        assertThat(list.get(0), is(nullValue()));
    }

    @Test
    public void givenList_whenClear_thenAllElementsAreRemoved() {
        List<Object> list = new CustomList<>();
        list.add("baeldung");
        list.clear();

        assertThat(list.size(), is(0));
    }

    @Test
    public void givenList_whenIndexOf_thenIndexZeroIsReturned() {
        List<Object> list = new CustomList<>();
        list.add("baeldung");

        assertThat(list.indexOf("baeldung"), is(0));
    }

    @Test
    public void givenList_whenIndexOf_thenPositiveIndexOrMinusOneIsReturned() {
        List<Object> list = new CustomList<>();
        list.add("baeldung");
        list.add(".com");
        list.add(".com");

        assertThat(list.indexOf(".com"), is(1));
        assertThat(list.indexOf("no_index"), is(-1));
    }

    @Test
    public void whenLastIndexOf_thenIndexZeroIsReturned() {
        List<Object> list = new CustomList<>();
        list.add("baeldung");

        assertThat(list.lastIndexOf("baeldung"), is(0));
    }

    @Test
    public void whenLastIndexOf_thenPositiveIndexOrMinusOneIsReturned() {
        List<Object> list = new CustomList<>();
        list.add("baeldung");
        list.add("baeldung");
        list.add(".com");

        assertThat(list.lastIndexOf("baeldung"), is(1));
        assertThat(list.lastIndexOf("no_index"), is(-1));
    }

    @Test
    public void whenSubListZeroToOne_thenListContainingFirstElementIsReturned() {
        List<Object> list = new CustomList<>();
        list.add("baeldung");
        List<Object> subList = list.subList(0, 1);

        assertThat(subList.get(0), is("baeldung"));
    }

    @Test
    public void whenSubListOneToTwo_thenListContainingSecondElementIsReturned() {
        List<Object> list = new CustomList<>();
        list.add("baeldung");
        list.add(".");
        list.add("com");
        List<Object> subList = list.subList(1, 2);

        assertThat(subList.size(), is(1));
        assertThat(subList.get(0), is("."));
    }

    @Test
    public void givenListWithElements_whenToArray_thenArrayContainsThose() {
        List<Object> list = new CustomList<>();
        list.add("baeldung");
        list.add(".com");
        Object[] array = list.toArray();

        assertThat(array, Matchers.arrayContaining("baeldung", ".com"));
    }

    @Test
    public void givenListWithAnElement_whenToArray_thenInputArrayIsReturned() {
        List<Object> list = new CustomList<>();
        list.add("baeldung");
        String[] input = new String[1];
        list.toArray(input);

        assertThat(input, Matchers.arrayContaining("baeldung"));
    }

    @Test
    public void whenToArrayIsCalledWithEmptyInputArray_thenNewArrayIsReturned() {
        List<Object> list = new CustomList<>();
        list.add("baeldung");
        String[] input = {};
        String[] output = list.toArray(input);

        assertThat(output, Matchers.arrayContaining("baeldung"));
    }

    @Test
    public void whenToArrayIsCalledWithLargerInput_thenOutputHasTrailingNull() {
        List<Object> list = new CustomList<>();
        list.add("baeldung");
        String[] input = new String[2];
        String[] output = list.toArray(input);

        assertThat(output, Matchers.arrayContaining("baeldung", null));
    }

    @Test
    public void givenListWithOneElement_whenIterator_thenThisElementIsNext() {
        List<Object> list = new CustomList<>();
        list.add("baeldung");
        Iterator<Object> iterator = list.iterator();

        assertThat(iterator.hasNext(), is(true));
        assertThat(iterator.next(), is("baeldung"));
    }

    @Test
    public void whenIteratorHasNextIsCalledTwice_thenTheSecondReturnsFalse() {
        List<Object> list = new CustomList<>();
        list.add("baeldung");
        Iterator<Object> iterator = list.iterator();

        iterator.next();
        assertThat(iterator.hasNext(), is(false));
    }


}