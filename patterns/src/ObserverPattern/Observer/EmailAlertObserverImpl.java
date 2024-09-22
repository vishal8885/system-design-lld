package ObserverPattern.Observer;

import ObserverPattern.Obervable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {

    String emailId;
    StocksObservable observable;

    public EmailAlertObserverImpl(String emailId, StocksObservable observable) {
        this.emailId = emailId;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendEmail(emailId, "product is in stock hurry up");
    }

    private void sendEmail(String mailId, String msg) {
        System.out.println("Mail sent to: "+ mailId);
    }
}
