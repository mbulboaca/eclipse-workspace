import java.util.Scanner;

public class RightAngleTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		
		System.out.println("Enter number of rows: ");
			
		int i,j,n;  
			n = sc.nextInt();
		
			for( i=0; i<=n; i++ ) {	
			
		
			for ( j=1; j<=i; j++) 
			
				System.out.print(j);
		    System.out.println("");
		}

	}

}
