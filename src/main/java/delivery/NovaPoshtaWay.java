package delivery;

public class NovaPoshtaWay implements Delivery{

    public boolean prepare() {
        System.out.println("Delivered by NovaPoshta");
        return true;
    }
}
