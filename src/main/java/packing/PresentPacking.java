package packing;

import flowers.Order;

public class PresentPacking extends Packing {

    public PresentPacking(Order order) {
        super(order);
    }

    @Override
    public boolean process() {
        System.out.println("Packed with nice paper");
        return super.process();
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 20;
    }
}
