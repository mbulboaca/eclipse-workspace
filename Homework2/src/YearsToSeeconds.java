import java.util.Scanner;

public class YearsToSeeconds {

	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in); 
		
		System.out.println("Enter your number off years: ");
		
		int a = scanner.nextInt(); 
		long sum = (365 * (3600 * 24 ) * a);
		
		System.out.println("At this moment, you lived for " + sum + " seconds, for now");
		scanner.close();
		
		
		
		

	}

}
