package warmup.SockMerchant;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void shouldReturnTwoForGivenArr() {
        int arr[] = {1, 2, 1, 2, 1, 3, 2};
        assertEquals(2, Solution.sockMerchant(arr.length, arr));
    }

    @Test
    public void shouldReturnThreeForGivenArr() {
        int arr[] = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        assertEquals(3, Solution.sockMerchant(arr.length, arr));
    }
}