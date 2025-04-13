package techcourse;

public class Application {

    public static void main(String[] args) {
        CafeOrder cafeOrder = new CafeOrder();

        String[] items = new String[]{"아메리카노", "라떼", "모카", "크로와상"};
        int[] quantities = new int[]{1, 2, 3, 4};
        int priceForPay = cafeOrder.calculateTotalPrice(items, quantities);
        System.out.println(priceForPay);
    }
}
