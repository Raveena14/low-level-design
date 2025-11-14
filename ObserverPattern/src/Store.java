import observable.IPhoneObservableImpl;
import observable.StocksObservable;
import observer.EmailAlertObserverImpl;
import observer.MobileAlertObserverImpl;
import observer.NotificationAlertObserver;

public class Store {

	public static void main(String args[]) {
		
		StocksObservable stockObservable = new IPhoneObservableImpl();
		
		NotificationAlertObserver nao1 = new EmailAlertObserverImpl("abcd@gmail.com", stockObservable);
		NotificationAlertObserver nao2 = new EmailAlertObserverImpl("abcdefgh@gmail.com", stockObservable);
		NotificationAlertObserver nao3 = new MobileAlertObserverImpl("username1", stockObservable);
		
		stockObservable.add(nao1);
		stockObservable.add(nao2);
		stockObservable.add(nao3);
		
		stockObservable.setStockCount(10);

	}
	
}
