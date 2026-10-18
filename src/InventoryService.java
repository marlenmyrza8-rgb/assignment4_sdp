public class InventoryService {
    public boolean reserveProduct(String productId) {
        System.out.println("Inventory: Товар " + productId + " зарезервирован.");
        return true;
    }

    public void releaseProduct(String productId) {
        System.out.println("Inventory: Резерв товара " + productId + " отменен.");
    }
}
