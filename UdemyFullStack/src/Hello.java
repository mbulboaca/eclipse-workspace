
public class Hello {

	public static void main(String[] args) {
		
		Car car = new Car("closed" , "on", "seated", 10); 

		
		System.out.println(car.run()); 
		
		
		Smartphone phone = new Smartphone(); 
		System.out.println(phone.getBrand()); 
	}

}
