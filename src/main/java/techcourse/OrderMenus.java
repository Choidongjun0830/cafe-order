package techcourse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrderMenus {

    private final List<OrderMenu> orderMenus = new ArrayList<>();

    public OrderMenus(String[] items, int[] quantities) {
        for (int i = 0; i < items.length; i++) {
            Menu menu = Menu.getMenuByName(items[i]);
            orderMenus.add(new OrderMenu(menu, quantities[i]));
        }
    }

    public int computeTotalPrice() {
        return orderMenus.stream()
                .mapToInt(OrderMenu::computePrice)
                .sum();
    }

    public int computeDrinkTotalPrice() {
        return orderMenus.stream()
                .filter(OrderMenu::isDrink)
                .mapToInt(OrderMenu::computePrice)
                .sum();
    }

    public int computeDrinkCount() {
        return orderMenus.stream()
                .filter(OrderMenu::isDrink)
                .mapToInt(OrderMenu::getQuantity)
                .sum();
    }

    public long getAmericanoQuantity() {
        return orderMenus.stream()
                .filter(OrderMenu::isAmericano)
                .count();
    }

    public List<OrderMenu> getOrderMenus() {
        return Collections.unmodifiableList(orderMenus);
    }
}
