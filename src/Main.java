public class Main {
    public static void main(String[] args) {

        OrderFacade orderFacade = new OrderFacade();

        orderFacade.placeOrder("MacBook_Air", "ACC-998", 1200.00, "marlen@example.com");
    }
}