package ObserverPattern.Observer;

import ObserverPattern.Obervable.StocksObservable;

public class MobileAlertsObserverImpl implements NotificationAlertObserver {

    String mobileNumber;
    StocksObservable observable;

    public MobileAlertsObserverImpl(String mobileNumber, StocksObservable observable) {
        this.mobileNumber = mobileNumber;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendSms(mobileNumber, "Stock is available");
    }

    private void sendSms(String mobileNumber, String msg) {
        System.out.println("Sms sent to: " + mobileNumber);
    }
}
