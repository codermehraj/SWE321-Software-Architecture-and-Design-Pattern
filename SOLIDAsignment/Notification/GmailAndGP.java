package SOLIDAsignment.Notification;

public class GmailAndGP implements EmailNotifier, SMSNotifier {

    @Override
    public void sendSMS() {
        System.out.println("GP SMS sent.");
    }

    @Override
    public void sendEmail() {
        System.out.println("Gmail email sent.");
    }
}
