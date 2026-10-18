public class ShippingService {
    public String dispatch(String productId) {
        System.out.println("Shipping: Товар " + productId + " передан в доставку.");
        return "TRACK-12345";
    }
}
