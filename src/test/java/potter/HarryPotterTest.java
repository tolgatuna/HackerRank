package potter;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class HarryPotterTest {

    @Test
    public void shouldReturnPriceWithoutDiscountForOneBook() {
        List<Integer> basket = Arrays.asList(1, 0, 0, 0, 0);

        HarryPotter harryPotterBasket = new HarryPotter();
        double price = harryPotterBasket.calculatePrice(basket);

        assertThat("Price should be 8 for one book", price, is(8.0));

    }

    @Test
    public void shouldReturnPriceWithoutDiscountForSameBooks() {
        List<Integer> basket = Arrays.asList(2, 0, 0, 0, 0);

        HarryPotter harryPotterBasket = new HarryPotter();
        double price = harryPotterBasket.calculatePrice(basket);

        assertThat("Price should be 16 for two same books", price, is(16.0));

    }

    @Test
    public void shouldReturnPriceWithFivePercentageDiscountForTwoDifferentBook() {
        List<Integer> basket = Arrays.asList(1, 1, 0, 0, 0);

        HarryPotter harryPotterBasket = new HarryPotter();
        double price = harryPotterBasket.calculatePrice(basket);

        assertThat("Price should be 15.20 for two different books", price, is(15.20));

    }

    @Test
    public void shouldReturnPriceWithTenPercentageDiscountForThreeDifferentBook() {
        List<Integer> basket = Arrays.asList(1, 1, 1, 0, 0);

        HarryPotter harryPotterBasket = new HarryPotter();
        double price = harryPotterBasket.calculatePrice(basket);

        assertThat("Price should be 21.60 for three different books", price, is(21.60));

    }

    @Test
    public void shouldReturnPriceWithTwentyPercentageDiscountForFourDifferentBook() {
        List<Integer> basket = Arrays.asList(1, 1, 1, 1, 0);

        HarryPotter harryPotterBasket = new HarryPotter();
        double price = harryPotterBasket.calculatePrice(basket);

        assertThat("Price should be 25.60 for four different books", price, is(25.60));

    }

    @Test
    public void shouldReturnPriceWithTwentyFivePercentageDiscountForFiveDifferentBook() {
        List<Integer> basket = Arrays.asList(1, 1, 1, 1, 1);

        HarryPotter harryPotterBasket = new HarryPotter();
        double price = harryPotterBasket.calculatePrice(basket);

        assertThat("Price should be 30.00 for five different books", price, is(30.00));

    }

    @Test
    public void shouldReturnPriceWithFivePercentageDiscountForTwoDifferentBookAndNoDiscountForOne() {
        List<Integer> basket = Arrays.asList(2, 1, 0, 0, 0);

        HarryPotter harryPotterBasket = new HarryPotter();
        double price = harryPotterBasket.calculatePrice(basket);

        assertThat("Price should be 23.20 for two different books and one same book", price, is(23.20));

    }

    @Test
    public void shouldReturnPriceWithTenPercentageDiscountForThreeDifferentBookAndNoDiscountForOne() {
        List<Integer> basket = Arrays.asList(2, 1, 1, 0, 0);

        HarryPotter harryPotterBasket = new HarryPotter();
        double price = harryPotterBasket.calculatePrice(basket);

        assertThat("Price should be 29.60 for three different books and one same book", price, is(29.60));
    }

    @Test
    public void shouldReturnPriceTwoTwentyPercentageDiscountForTwoTimesFourDifferentBooks() {
        List<Integer> basket = Arrays.asList(2, 2, 2, 1, 1);

        HarryPotter harryPotterBasket = new HarryPotter();
        double price = harryPotterBasket.calculatePrice(basket);

        assertThat("Price should be 51.20 for three different books and one same book", price, is(51.20));
    }

    @Test
    public void shouldReturnPriceTwoTwentyPercentageDiscountForMoreThanTwoTimesFourDifferentBooks() {
        List<Integer> basket = Arrays.asList(3, 3, 3, 2, 2); // 1 1 1 1 1 + 2 2 2 1 1 = 81.20

        HarryPotter harryPotterBasket = new HarryPotter();
        double price = harryPotterBasket.calculatePrice(basket);

        assertThat("Price should be 51.20 for three different books and one same book", price, is(81.20));
    }
}