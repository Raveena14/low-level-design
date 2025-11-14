package observable;

import observer.NotificationAlertObserver;

public interface StocksObservable {

	public void add(NotificationAlertObserver nao);
	
	public void remove(NotificationAlertObserver nao);
	
	public void notifySubscribers();
	
	public void setStockCount(int stockCount);
	
	public int getStockCount();
	
}
