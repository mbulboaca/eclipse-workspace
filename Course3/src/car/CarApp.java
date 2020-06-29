package car;

public class CarApp {

	public static void main(String[] args) {
		Engine e1 = new Engine("16V", 80);
		Engine e2 = new Engine("16", 120);
		
		Car c1 = new Car(110, e1);
		c1.setDrivers(1);
		Car c2 = new Car(110, e2);
		c2.drivers = 2;
		c2.wheels = 4;
		
		Car c3 = new Car(110, e2);
		c3.setDrivers(12);
		
		System.out.println(c1);
		System.out.println(c2);

	}

}
