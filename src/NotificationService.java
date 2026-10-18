public class NotificationService {
    public void sendConfirmation(String customerEmail, String trackingId) {
        System.out.println("Notification: Письмо отправлено на " + customerEmail + " с треком " + trackingId);
    }
}
