package techcourse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class OrderMenus {

    private final Map<Menu, Integer> orderMenus = new HashMap<>();

    public OrderMenus(String[] items, int[] quantities) {
        //TODO: items와 quantites 길이가 다르면 예외
        for (int i = 0; i < items.length; i++) {
            Menu menu = Menu.getMenuByName(items[i]);
            orderMenus.put(menu, quantities[i]);
        }
    }

    public int computeTotalPrice() {
        int totalPrice = 0;
        for (Entry<Menu, Integer> orderMenu : orderMenus.entrySet()) {
            Menu menu = orderMenu.getKey();
            totalPrice += menu.getPrice() * orderMenu.getValue();
        }
        return totalPrice;
    }

    public int computeDrinkCount() {
        int drinkCount = 0;
        for (Entry<Menu, Integer> orderMenu : orderMenus.entrySet()) {
            if (orderMenu.getKey().isDrink()) {
                drinkCount += orderMenu.getValue();
            }
        }

        return drinkCount;
    }

    public Map<Menu, Integer> getOrderMenus() {
        return Collections.unmodifiableMap(orderMenus);
    }
}
