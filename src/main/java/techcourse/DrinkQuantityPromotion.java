package techcourse;

public class DrinkQuantityPromotion implements Promotion{

    private final OrderMenus orderMenus;

    public DrinkQuantityPromotion(OrderMenus orderMenus) {
        this.orderMenus = orderMenus;
    }

    @Override
    public boolean isApplicable() {
        return orderMenus.computeDrinkCount() >= 5;
    }

    @Override
    public int applyPromotion() {
        return (int) (orderMenus.computeDrinkTotalPrice() * 0.1);
    }
}
