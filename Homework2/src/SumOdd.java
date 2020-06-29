

public class SumOdd {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i = 1; i<10; i=i+2) {
			
			System.out.println("The odd numbers are: " + i);
			sum = sum + i;  
			
		}
		
	
		System.out.println("The sum of the odd numbers is: " + sum);

	}

}
