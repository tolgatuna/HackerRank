package arrays.NewYearsChaos;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testMinimumBribes01() {
        int arr[] = {2, 5, 1, 3, 4};

        Solution.minimumBribes(arr);
        assertEquals("hello again", outContent.toString());
    }

    @Test
    public void testMinimumBribes02() {
        int arr[] = {2, 1, 5, 3, 4};
        Solution.minimumBribes(arr);
        assertEquals("hello again", outContent.toString());
    }

    @Test
    public void testMinimumBribes03() {
        int arr[] = {1, 2, 5, 3, 4, 7, 8, 6};
        Solution.minimumBribes(arr);
        assertEquals("4\n", outContent.toString());
    }
}