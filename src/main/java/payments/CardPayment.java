package payments;

public class CardPayment implements Payment {

    @Override
    public boolean process(double price) {
        System.out.println("Payment with card");
        return true;
    }

}
