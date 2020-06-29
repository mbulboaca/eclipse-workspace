import java.util.Scanner;

public class AreaCalc {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Please enter the base of the triangle: ");
		double base = scanner.nextDouble();
		
		System.out.println("Please enter the height of the triangle: ");
		double height = scanner.nextDouble(); 
		
		double area = (base * height) / 2; 
		System.out.println("The area of the triangle is: " + area + " m2");
		scanner.close();
		
		
		
				
	}

}
