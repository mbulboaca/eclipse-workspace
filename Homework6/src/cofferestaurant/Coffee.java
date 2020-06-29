package cofferestaurant;

public class Coffee {
	int degrees;
	
	public Coffee(int degrees) {
		this.degrees = degrees;
	}
	
	void analyze() throws Exception {
		if(this.degrees <= 35)
			throw new Exception("Call the manager!!!");
		if(this.degrees >= 70)
			throw new Exception("Bring water to the client!");
	}
}


