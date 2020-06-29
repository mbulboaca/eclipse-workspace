package PrimeNumbers;

public class Main {

	public static void main(String[] args) {
		
	int num = 8; 
	boolean trigger = false; 
	
	for(int i = 2; i <= num/2 ; ++i) {
		
		if(num % i == 0) {
			trigger = true;
					break; 
		}
	}
		if(!trigger)
		System.out.println("The number " + num + " is prime");
		else
		System.out.println("The number " + num + " is not prime");
		
	
		 int val = 1234567;
		 int sumOfVal = 0;
		 
		 while(true) {
			 
			 sumOfVal = sumOfVal + val%10;
			 val = val /10 ;
			 
			 if(val <= 10 )
				break;
			 
		 }
			 			sumOfVal = sumOfVal + val; 
			 			System.out.println(sumOfVal);
			
	}
}