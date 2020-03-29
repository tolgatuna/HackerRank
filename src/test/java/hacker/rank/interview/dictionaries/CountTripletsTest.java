package hacker.rank.interview.dictionaries;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertThat;

public class CountTripletsTest {
    @Test
    public void testCountTripletsMethod() {
//        assertThat(CountTriplets.countTriplets(Arrays.asList(1L, 2L, 2L, 4L), 2), CoreMatchers.is(2L));
//        assertThat(CountTriplets.countTriplets(Arrays.asList(1L, 3L, 9L, 9L, 27L, 81L), 3), CoreMatchers.is(6L));
//        assertThat(CountTriplets.countTriplets(Arrays.asList(1L, 5L, 5L, 25L, 125L), 5), CoreMatchers.is(4L));
        assertThat(CountTriplets.countTriplets(Arrays.asList(1L, 1L, 1L, 1L), 1), CoreMatchers.is(4L));
    }
}