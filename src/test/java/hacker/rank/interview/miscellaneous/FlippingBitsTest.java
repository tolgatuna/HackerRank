package hacker.rank.interview.miscellaneous;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class FlippingBitsTest {
    @Test
    public void testFlippingBits() {
        assertThat(FlippingBits.flippingBits(2147483647L), CoreMatchers.is(2147483648L));
        assertThat(FlippingBits.flippingBits(1L), CoreMatchers.is(4294967294L));
        assertThat(FlippingBits.flippingBits(0L), CoreMatchers.is(4294967295L));
    }
}