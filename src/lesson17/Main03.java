package lesson17;

public class Main03 {
    // Low coupling - зміна/видалення класу не має зачіпати інші класи
    static interface Notifier {
        void sendNotification();
    }

    static class EmailNotifier implements Notifier {

        @Override
        public void sendNotification() {
            System.out.println("Sent letter to email");
        }
    }

    static class SmsNotifier implements Notifier {

        @Override
        public void sendNotification() {
            System.out.println("Sent text to sms");
        }
    }

    static class NotificationController {
        private Notifier notifier = null;

        public void setNotifier(Notifier notifier) {
            this.notifier = notifier;
        }
        public void sendMessage(String s) {
            System.out.println("Sending message: " + s);
            notifier.sendNotification();
        }
    }

    public static void main(String[] args) {
        NotificationController controller
                = new NotificationController();
        controller.setNotifier(new SmsNotifier());

        controller.sendMessage("Hello!");
    }
}
