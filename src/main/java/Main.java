import database.DatabaseUnique;
import delivery.NovaPoshtaWay;
import discounts.Minus20;
import flowers.*;
import lombok.SneakyThrows;
import packing.PresentPacking;
import payments.Privat24Payment;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Main {

    @SneakyThrows
    public static void main(String[] args) {

        // We can create flowers of different types
        Flower chamomile = new Flower(FlowerType.CHAMOMILE, Color.WHITE, 10, new FlowerSpec());
        Flower rose = new Flower(FlowerType.ROSE, Color.RED, 15, new FlowerSpec());
        Flower chamomileREd = new Flower(FlowerType.CHAMOMILE, Color.RED, 20, new FlowerSpec());

        // We can specify additional parameters, if needed - country, odor(the same variants as flowers)
        // and the length of sepal
        rose.setOriginCountry(Country.ARGENTINA);
        chamomile.setOdor(FlowerType.ROSE);
        chamomileREd.setSepalLength(10);

        System.out.println(chamomile);
        System.out.println(rose);
        System.out.println(chamomileREd);

        // We can form a bucket of out own
        // 3 roses, 3 red chamomile, 3 while chamomile
        FlowerBucket bucket = new FlowerBucket();
        for (int i = 1; i < 3; i++) {
            bucket.addFlower(chamomile, i);
            bucket.addFlower(chamomileREd, i);
            bucket.addFlower(rose, i);
        }

        System.out.println(bucket.getFlowers());
        System.out.println("Price: " + bucket.getPrice());

        // Now we can form our order
        Order order = new Order();
        order.addFlowerBucket(bucket);

        Privat24Payment p24 = new Privat24Payment();
        NovaPoshtaWay NPoshta = new NovaPoshtaWay();
        order.setPayment(p24);
        order.setDelivery(NPoshta);

        System.out.println("Price of your order " + order.getPrice());

        // and choose different packing of the order
        order = new PresentPacking(order);
        System.out.println("Price after packing " + order.getPrice());

        // we can get different types of discounts
        order = new Minus20(order);
        System.out.println("Price after discount " + order.getPrice());

        order.process();


//        DatabaseUnique db1 = DatabaseUnique.getInstance();
//        db1.add(order);
//        db1.commit();
//
//        System.out.println(order.getPrice());
//        System.out.println(order.process());
//        DatabaseUnique db2 = DatabaseUnique.getInstance();
//        db2.add(order);
//        db2.commit();
//
//        BufferedWriter file = new BufferedWriter(new FileWriter("my.txt", true));
//        file.write("mama...");
//        file.close();

    }
}
