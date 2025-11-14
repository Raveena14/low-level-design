package observer;

import observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{
	
	StocksObservable stockObservable;
	String emailId;

	public EmailAlertObserverImpl(String emailId, StocksObservable stockObj) {
		
		this.emailId = emailId;
		this.stockObservable = stockObj;
		
	}

	@Override
	public void update() {
		sendEmail(emailId, "Product is in stock hurry!!!");
	}
	
	private void sendEmail(String emailId, String msg){
		System.out.println("Email sent to : " + emailId);
	}
	
	
}
