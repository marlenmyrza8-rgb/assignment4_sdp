# Assignment 4: Facade Pattern
**Course:** ShP-2216 – Software Design Patterns
**Topic:** Online Order Processing Facade

## Description
This project implements the Facade design pattern to simplify an online order processing system. The `OrderFacade` class provides a unified interface (`placeOrder`) that coordinates four complex subsystems: `InventoryService`, `PaymentProcessor`, `ShippingService`, and `NotificationService`. It also handles basic rollback logic if a step like payment fails.
