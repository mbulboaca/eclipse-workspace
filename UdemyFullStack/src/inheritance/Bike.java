package inheritance;

import com.test.org.Vehicle;

public class Bike extends Vehicle {

	public String handle;

	public Bike() {
		super();
		this.handle = "short";
	}

	public Bike(String handle, String engine, int wheels, int seats, int fuelTank, String lights) {
		super(engine, wheels, seats, fuelTank, lights);
		this.handle = handle;
	}

	public String getHandle() {
		return handle;
	}

	@Override
	public String toString() {
		return "Bike [getHandle()=" + getHandle() + ", getEngine()=" + getEngine() + ", getWheels()=" + getWheels()
				+ ", getSeats()=" + getSeats() + ", getFuelTank()=" + getFuelTank() + ", getLights()=" + getLights()
				+ "]";
	}

	public void run() {

		System.out.println("Running bike");
		System.out.println(toString());
	}

}
