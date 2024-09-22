package ObserverPattern.Obervable;

import ObserverPattern.Observer.NotificationAlertObserver;

public interface StocksObservable {
    void add(NotificationAlertObserver observer);

    void remove(NotificationAlertObserver observer);

    void notifySubscribers();

    void setStockCount(int count);

    int getStockCount();
}
