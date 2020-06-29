package NegativePositive;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Enter a value to see if it s negative or positive");
		double a = sc.nextDouble();
		
		if( a > 0.0 )
			System.out.println("The value of " + a + " it's positive");
		else
			System.out.println("The value of " + a + " it's negative");
	}

}
