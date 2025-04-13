package techcourse;

import java.util.Arrays;

public enum Menu {

    AMERICANO("아메리카노",1_500, true),
    LATTE("라떼", 2_000, true),
    MOCHA("모카", 2_500, true),
    CROISSANT("크로와상", 3_000, false);

    private final String name;
    private final int price;
    private final boolean isDrink;

    Menu(String name, int price, boolean isDrink) {
        this.name = name;
        this.price = price;
        this.isDrink = isDrink;
    }

    public static Menu getMenuByName(final String name) {
        return Arrays.stream(values())
                .filter(menu -> name.equals(menu.name))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("해당하는 메뉴가 없습니다."));
    }

    public int getPrice() {
        return price;
    }

    public boolean isDrink() {
        return isDrink;
    }
}
