package techcourse;

import java.util.List;

public class CafeOrder {

    public OrderMenus getOrderMenus(final String[] items, final int[] quantities) {
        return new OrderMenus(items, quantities);
    }

    public int computeDrinkCount(final OrderMenus orderMenus) {
        return orderMenus.computeDrinkCount();
    }

    public int calculateTotalPrice(String[] items, int[] quantities) {
        OrderMenus orderMenus = getOrderMenus(items, quantities);
        int total = orderMenus.computeTotalPrice();

        int drinkCount = orderMenus.computeDrinkCount();

        if (drinkCount >= 5) {
            int drinkTotal = orderMenus.computeDrinkTotalPrice();
            total -= drinkTotal / 10;
        }

        return total;
    }
}
