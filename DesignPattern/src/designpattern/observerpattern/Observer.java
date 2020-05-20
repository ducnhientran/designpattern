package designpattern.observerpattern;


/**
 * The purpose of Observer interface is to observe all change of the Object.
 * 
 * 
 * */
public interface Observer {
	
	public void update(float temp, float humidity, float pressure);
}
