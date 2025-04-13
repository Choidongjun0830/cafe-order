package techcourse;

public class AmericanoPromotion implements Promotion{

    public final OrderMenus orderMenus;

    public AmericanoPromotion(OrderMenus orderMenus) {
        this.orderMenus = orderMenus;
    }

    @Override
    public boolean isApplicable() {
        return true;
    }

    @Override
    public int applyPromotion() {
        return (int) (orderMenus.getAmericanoQuantity() * 300);
    }
}
