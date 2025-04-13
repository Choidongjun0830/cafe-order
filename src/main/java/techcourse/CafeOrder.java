package techcourse;

public class CafeOrder {

    public OrderMenus getOrderMenus(final String[] items, final int[] quantities) {
        return new OrderMenus(items, quantities);
    }

    public int calculateTotalPrice(String[] items, int[] quantities) {
        OrderMenus orderMenus = getOrderMenus(items, quantities);
        Payment payment = new Payment(new AmericanoPromotion(orderMenus), new DrinkQuantityPromotion(orderMenus));

        return orderMenus.computeTotalPrice() - payment.computeTotalDiscountPrice();
    }
}
