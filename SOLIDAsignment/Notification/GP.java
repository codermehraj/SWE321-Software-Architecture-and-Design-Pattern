package SOLIDAsignment.Notification;

public class GP implements SMSNotifier {

    @Override
    public void sendSMS() {
        System.out.println("GP SMS sent.");
    }

}
