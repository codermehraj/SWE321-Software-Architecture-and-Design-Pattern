package SOLIDAsignment.Notification;

public class Gmail implements EmailNotifier {

    @Override
    public void sendEmail() {
        System.out.println("Gmail email sent.");
    }

}
