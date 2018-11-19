package payments;

public class Privat24Payment implements Payment {

    @Override
    public boolean process(double price) {
        System.out.format("Paid %.2f with Privat24\n", price);
        return true;
    }
}
