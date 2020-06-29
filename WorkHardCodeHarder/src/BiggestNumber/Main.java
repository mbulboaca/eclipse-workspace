package BiggestNumber;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 3 random numbers to see who is bigger");
		
		System.out.println("Enter first number");
		int a = sc.nextInt();  
		System.out.println("Enter second number");
		int b = sc.nextInt(); 
		System.out.println("Enter third number");
		int c = sc.nextInt();
		
		if(a > b && a > c) 
			System.out.println("The number " + a + " is bigger");
		else if(b > a && b > c ) 
			System.out.println("The number " + b + " is bigger");
		else
			System.out.println("The number " + c + " is bigger");

	}

}
