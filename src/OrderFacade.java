public class OrderFacade {
    private final InventoryService inventory;
    private final PaymentProcessor payment;
    private final ShippingService shipping;
    private final NotificationService notification;

    public OrderFacade() {
        this.inventory = new InventoryService();
        this.payment = new PaymentProcessor();
        this.shipping = new ShippingService();
        this.notification = new NotificationService();
    }

    public void placeOrder(String productId, String accountId, double amount, String email) {
        System.out.println("--- Начинаем обработку заказа ---");

        if (!inventory.reserveProduct(productId)) {
            System.out.println("Ошибка: Товара нет в наличии.");
            return;
        }

        if (!payment.processPayment(accountId, amount)) {
            System.out.println("Ошибка: Оплата отклонена. Отмена заказа...");
            inventory.releaseProduct(productId);
            return;
        }

        String trackingId = shipping.dispatch(productId);

        notification.sendConfirmation(email, trackingId);

        System.out.println("--- Заказ успешно оформлен ---");
    }
}