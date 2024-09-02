 abstract class PaymentMethod {
    // Abstract method to process the payment
    public abstract void processPayment(double amount);

    // Concrete method to validate payment details
    public void validatePaymentDetails() {
        System.out.println("Validating payment details...");
    }
}
 abstract class OnlinePaymentMethod extends PaymentMethod{
    public abstract void authenticateUser();
    public void sendPaymentConfirmation(){
        System.out.println("your payment has been transacted successfully.");
    }
}
class PaypalPayment extends OnlinePaymentMethod{

    public void processPayment(double amount) {
        authenticateUser();
        System.out.println("Processing PayPal payment of $" + amount);
        sendPaymentConfirmation();
    }


    public void authenticateUser() {
        System.out.println("Authenticate user.....");
    }
}


public class paymentSystem {
    public static  void main(String args[]){
        PaypalPayment obj = new PaypalPayment();
        obj.processPayment(20000);
    }
}
