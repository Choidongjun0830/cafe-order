package techcourse;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Map.Entry;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class OrderMenusTest {

    @Test
    @DisplayName("OrderMenus 생성 테스트")
    void getOrderMenus() {
        String[] items = new String[]{"아메리카노", "라떼", "모카", "크로와상"};
        int[] quantities = new int[]{1, 2, 3, 4};

        assertThat(new OrderMenus(items, quantities).getOrderMenus().size()).isEqualTo(4);
    }

    @Test
    @DisplayName("drinkCount 계산 테스트")
    void drinkCount() {
        String[] items = new String[]{"아메리카노", "라떼", "모카", "크로와상"};
        int[] quantities = new int[]{1, 2, 3, 4};

        OrderMenus orderMenus = new OrderMenus(items, quantities);

        assertThat(orderMenus.computeDrinkCount()).isEqualTo(6);
    }
}
