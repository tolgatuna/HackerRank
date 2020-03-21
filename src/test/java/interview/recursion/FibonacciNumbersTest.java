package interview.recursion;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class FibonacciNumbersTest {

    @Test
    public void shouldReturnZeroForZero() {
        assertThat(FibonacciNumbers.fibonacci(0), is(0));
    }

    @Test
    public void shouldReturnOneForOne() {
        assertThat(FibonacciNumbers.fibonacci(1), is(1));
    }

    @Test
    public void shouldReturnOneForTwo() {
        assertThat(FibonacciNumbers.fibonacci(2), is(1));
    }

    @Test
    public void shouldReturnTwoForThree() {
        assertThat(FibonacciNumbers.fibonacci(3), is(2));
    }

    @Test
    public void shouldReturnEightForSix() {
        assertThat(FibonacciNumbers.fibonacci(6), is(8));
    }
}