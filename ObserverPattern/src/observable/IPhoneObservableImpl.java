package observable;

import java.util.ArrayList;
import java.util.List;

import observer.NotificationAlertObserver;

public class IPhoneObservableImpl implements StocksObservable{
	
	public List<NotificationAlertObserver> naoList = new ArrayList<NotificationAlertObserver>();
	int stockCount = 0;
	
	@Override
	public void add(NotificationAlertObserver nao) {
		// TODO Auto-generated method stub
		naoList.add(nao);
		
	}

	@Override
	public void remove(NotificationAlertObserver nao) {
		// TODO Auto-generated method stub
		naoList.remove(nao);
	}

	@Override
	public void notifySubscribers() {
		// TODO Auto-generated method stub
		for(NotificationAlertObserver nao : naoList) {
			nao.update();
		}
		
	}

	@Override
	public void setStockCount(int newStockCount) {
		// TODO Auto-generated method stub
		if(stockCount == 0) {
			notifySubscribers();
		}
		stockCount = stockCount + newStockCount;
		
	}

	@Override
	public int getStockCount() {
		// TODO Auto-generated method stub
		return stockCount;
	}

}
;