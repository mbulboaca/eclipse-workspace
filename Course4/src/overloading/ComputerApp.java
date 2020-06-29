package overloading;

public class ComputerApp {

	public static void main(String[] args) {
		Compute c = new Compute();
		System.out.println(c.add(2, 3));
		
		System.out.println(c.multiply(2, 3));
		
		System.out.println(c.add(4, 5, 6, 7));

	}

}
