package observer;

import observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{
	StocksObservable stockObservable;
	String username;

	public MobileAlertObserverImpl(String username, StocksObservable stockObj) {
		
		this.username = username;
		this.stockObservable = stockObj;
		
	}

	@Override
	public void update() {
		sendToMobile(username, "Product is in stock hurry!!!");
	}
	
	private void sendToMobile(String username, String msg){
		System.out.println("message sent to : " + username);
	}
}
