package designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象主题类
 * @author liuhao
 *
 */
public abstract class Subject {
	private List<Observer> observers = new ArrayList<Observer>();
	
	public void add(Observer observer) {
		observers.add(observer);
	}
	
	public void delete(Observer observer) {
		observers.remove(observer);
	}
	
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update();
		}
	}
	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
}
