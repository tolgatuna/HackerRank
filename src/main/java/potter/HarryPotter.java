package potter;

import java.util.List;

public class HarryPotter {
    private static final double BOOK_PRICE = 8.0;
    private static final double TWO_BOOKS_DISCOUNT = 0.95;
    private static final double THREE_BOOKS_DISCOUNT = 0.90;
    private static final double FOUR_BOOKS_DISCOUNT = 0.80;
    private static final double FIVE_BOOKS_DISCOUNT = 0.75;


    public double calculatePrice(List<Integer> basket) {
        return calculatePrice(basket, 0.0);
    }

    private double calculatePrice(List<Integer> basket, double price) {
        int discountedBookCount = 0;
        int remainingTotalBookCount = 0;
        int remainingDiffBookCount = 0;

        for (int i = 0; i < basket.size(); i++) {
            if (basket.get(i) > 0) {
                if (discountedBookCount < 4 || remainingDiffBookCount < 3 || remainingTotalBookCount > 4) {
                    discountedBookCount++;
                    remainingTotalBookCount += basket.get(i) - 1;
                    basket.set(i, basket.get(i) - 1);
                    if (basket.get(i) > 0)
                        remainingDiffBookCount++;
                }
            }
        }

        price += getPriceWithDiscount(discountedBookCount);
        if (remainingTotalBookCount > 0)
            return calculatePrice(basket, price);

        return price;
    }

    private double getPriceWithDiscount(int bookCount) {
        switch (bookCount) {
            case 2:
                return bookCount * TWO_BOOKS_DISCOUNT * BOOK_PRICE;
            case 3:
                return bookCount * THREE_BOOKS_DISCOUNT * BOOK_PRICE;
            case 4:
                return bookCount * FOUR_BOOKS_DISCOUNT * BOOK_PRICE;
            case 5:
                return bookCount * FIVE_BOOKS_DISCOUNT * BOOK_PRICE;
            default:
                return bookCount * BOOK_PRICE;
        }
    }
}
