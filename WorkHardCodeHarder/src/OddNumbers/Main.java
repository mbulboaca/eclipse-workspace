package OddNumbers;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Enter your number: ");
		
		int number = sc.nextInt();
			
		
		if(number % 2 == 0) {
			System.out.println("The number " + number + " is even " );
		}else {
			System.out.println("The number " + number + " is odd " );
		}
			
		
		

	}

}
