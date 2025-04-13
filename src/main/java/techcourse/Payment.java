package techcourse;

import java.util.Arrays;
import java.util.List;

public class Payment {

    private final List<Promotion> promotions;

    public Payment(final Promotion... promotions) {
        this.promotions = Arrays.asList(promotions);
    }

    public int computeTotalDiscountPrice() {
        return promotions.stream()
                .filter(Promotion::isApplicable)
                .mapToInt(Promotion::applyPromotion)
                .sum();
    }
}
