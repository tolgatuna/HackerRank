package interview.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MinimumSwap2Test {
    @Test
    public void shouldReturn3ForGivenArrWith4Elements() {
        int[] arr = {4, 3, 1, 2};
        assertThat(MinimumSwap2.minimumSwaps(arr), is(3));
    }

    @Test
    public void shouldReturn3ForGivenArrWith5Elements() {
        int[] arr = {2, 3, 4, 1, 5};
        assertThat(MinimumSwap2.minimumSwaps(arr), is(3));
    }

    @Test
    public void shouldReturn3ForGivenArrWith7Elements() {
        int[] arr = {1, 3, 5, 2, 4, 6, 7};
        assertThat(MinimumSwap2.minimumSwaps(arr), is(3));
    }
}