package techcourse;

public class OrderMenu {

    private final Menu menu;
    private final int quantity;

    public OrderMenu(Menu menu, int quantity) {
        this.menu = menu;
        this.quantity = quantity;
    }

    public int computePrice() {
        return menu.getPrice() * quantity;
    }

    public boolean isDrink() {
        return menu.isDrink();
    }

    public int getQuantity() {
        return quantity;
    }
}
