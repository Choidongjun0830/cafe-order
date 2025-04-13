package techcourse;

import java.util.List;

public class Payment {

    private final List<Promotion> promotions;

    public Payment(final OrderMenus orderMenus) {
        this.promotions = List.of(new AmericanoPromotion(orderMenus), new DrinkQuantityPromotion(orderMenus));
    }

    public int computeTotalDiscountPrice() {
        return promotions.stream()
                .filter(Promotion::isApplicable)
                .mapToInt(Promotion::applyPromotion)
                .sum();
    }
}
