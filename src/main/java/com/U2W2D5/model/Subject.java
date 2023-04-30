package com.U2W2D5.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
	
	private final List<Observer> observers = new ArrayList<Observer>();
	
	public List<Observer> getObservers() {
		return observers;
	}

	public boolean addObserver(Observer obs) {
		return this.getObservers().add(obs);
	}
	
	public boolean removeObserver(Observer obs) {
		return this.getObservers().remove(obs);
	}
	
	public void notifyObservers() {
		this.getObservers().forEach(elem -> elem.update(this));
	}
}
