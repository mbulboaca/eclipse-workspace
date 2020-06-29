package car;

public class Car {
	int wheels; 
	int drivers; 
	int speed; 
	Engine engine; 
	
	Car(int s, Engine e)	{
		speed = s; 
		engine = e; 
		
		
	}
	public void setDrivers(int d) { 
		if(d > 10) {
		System.err.println("Warning!! this is a shared car! No of drivers is: " + d); 
		
		}
		
		drivers = d; 
		
	}
	
	public int getDrivers() {
		return drivers; 
		
	}
	@Override
	public String toString() {
		return "Car [wheels=" + wheels + ", drivers=" + drivers + ", speed=" + speed + ", engine=" + engine + "]";
	}
	
	
}
