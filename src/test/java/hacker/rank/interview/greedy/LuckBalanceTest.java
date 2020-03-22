package hacker.rank.interview.greedy;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class LuckBalanceTest {

    @Test
    public void testLuckBalance() {

        assertThat(LuckBalance.luckBalance(2, new int[][]{
                {5, 1},
                {1, 1},
                {4, 0}
        }), CoreMatchers.is(10));

        assertThat(LuckBalance.luckBalance(3, new int[][]{
                {5, 1},
                {2, 1},
                {1, 1},
                {8, 1},
                {10, 0},
                {5, 0}
        }), CoreMatchers.is(29));
    }
}