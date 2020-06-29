import java.util.Scanner;

public class SumAverage {
	
	    public static void main (String[] args) {
	   
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter your numbers: ");
	    int num = sc.nextInt(); 
	    int sum = 0;
	    
	    
	    for(int i = 0; num>0; ++i) { 
	    	
	    	sum = sum + num % 10;
			num = num / 10;
			
				
			
	    }
	   
	   
	    
	    System.out.println("The sum is: " + sum);
	    System.out.println("The average is: " + sum / num);
      
 
    }
}