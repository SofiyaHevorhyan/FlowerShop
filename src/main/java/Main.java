import database.DatabaseUnique;
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

        Flower fl = new Flower(FlowerType.CHAMOMILE, Color.WHITE, 10, new FlowerSpec());

        FlowerBucket bucket = new FlowerBucket();
        for (int i = 1; i < 10; i++) {
            bucket.addFlower(fl, i);
        }
        Order order = new Order();
        order.addFlowerBucket(bucket);


        System.out.println(order.getPrice());
        System.out.println("here");
//        order = new Minus20(new PresentPacking(order));
//        System.out.println(order.getPrice());

        //Privat24Payment p24 = new Privat24Payment();

//
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
