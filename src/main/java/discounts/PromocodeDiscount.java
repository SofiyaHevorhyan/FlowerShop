package discounts;

import flowers.Order;

public class PromocodeDiscount extends Discount {

    public PromocodeDiscount(Order order) {
        super(order);
    }

    public double getPrice() {
        return 0.7*super.getPrice();
    }

}
