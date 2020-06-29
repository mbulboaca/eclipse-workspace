import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		
		int a = 5;
		double b = 3;
		
		String rezultat = "rezultatul este"; 
		
        System.out.println( "ce operatie vrei sa faci?" );
        Scanner in = new Scanner( System.in ); 
        String raspuns = in.nextLine();
        	if (raspuns.equals("adunare") ) {
        		
        		System.out.println( rezultat + ( a + b )); 
                System.out.println( a * b );
                System.out.println( a / b );
                System.out.println( a - b );
                   
        	}
        

      
	}	

}
