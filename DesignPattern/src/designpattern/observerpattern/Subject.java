package designpattern.observerpattern;


/**
 * 
 * Define functions to object interact with observer.
 * 
 * */
public interface Subject {
	
	public void registerObserver(Observer o);

	public void removeObserver(Observer o);

	public void notifyObservers();
}
