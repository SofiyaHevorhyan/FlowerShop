package flowers;

import lombok.Data;
import lombok.ToString;

import java.util.HashMap;


@Data
@ToString
public class FlowerBucket {
    private HashMap<Flower, Integer> flowers = new HashMap<Flower, Integer>();

    public void addFlower(Flower fl, int number) {
        flowers.put(fl, flowers.getOrDefault(fl, 0) + number);
    }

    public double maxSepalLength() {
        double max = 0;
        for (Flower key: flowers.keySet()) {
            if (key.getSepalLength() > max) {
                max = key.getSepalLength();
            }
        }
        return max;
    }

    public double getPrice() {
        double price = 0;
        for (Flower flower: flowers.keySet()) {
            price += flower.getPrice() * flowers.get(flower);
        }
        return price;
    }


}
