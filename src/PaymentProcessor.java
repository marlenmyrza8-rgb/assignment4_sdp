public class PaymentProcessor {
    public boolean processPayment(String accountId, double amount) {
        System.out.println("Payment: Оплата " + amount + " списана со счета " + accountId);
        return true;
    }
}