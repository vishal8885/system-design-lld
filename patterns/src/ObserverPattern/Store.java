package ObserverPattern;

import ObserverPattern.Obervable.IPhoneObservableImpl;
import ObserverPattern.Obervable.StocksObservable;
import ObserverPattern.Observer.EmailAlertObserverImpl;
import ObserverPattern.Observer.MobileAlertsObserverImpl;
import ObserverPattern.Observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        StocksObservable iphoneStockObservable = new IPhoneObservableImpl();

        NotificationAlertObserver user1 = new EmailAlertObserverImpl("test1@mail.com", iphoneStockObservable);
        NotificationAlertObserver user2 = new EmailAlertObserverImpl("test2@mail.com", iphoneStockObservable);
        NotificationAlertObserver user3 = new MobileAlertsObserverImpl("113213132", iphoneStockObservable);

        iphoneStockObservable.add(user1);
        iphoneStockObservable.add(user2);
        iphoneStockObservable.add(user3);

        iphoneStockObservable.setStockCount(10);
    }
}
