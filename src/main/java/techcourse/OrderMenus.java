package techcourse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class OrderMenus {

    private final List<OrderMenu> orderMenus = new ArrayList<>();

    public OrderMenus(String[] items, int[] quantities) {
        for (int i = 0; i < items.length; i++) {
            Menu menu = Menu.getMenuByName(items[i]);
            orderMenus.add(new OrderMenu(menu, quantities[i]));
        }
    }

    public int computeTotalPrice() {
        int totalPrice = 0;
        for (OrderMenu orderMenu : orderMenus) {
            totalPrice += orderMenu.computePrice();
        }
        return totalPrice;
    }

    public int computeDrinkTotalPrice() {
        int totalPrice = 0;
        for (OrderMenu orderMenu : orderMenus) {
            if (orderMenu.isDrink()) {
                totalPrice += orderMenu.computePrice();
            }
        }
        return totalPrice;
    }

    public int computeDrinkCount() {
        int drinkCount = 0;
        for (OrderMenu orderMenu : orderMenus) {
            if (orderMenu.isDrink()) {
                drinkCount += orderMenu.getQuantity();
            }
        }

        return drinkCount;
    }

    public List<OrderMenu> getOrderMenus() {
        return Collections.unmodifiableList(orderMenus);
    }
}
