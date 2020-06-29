import java.util.Scanner;

public class ReadApp {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		
		System.out.println(" Please insert your name ");
		String name = in.nextLine(); 
		
		System.out.println(" Please insert a number ");
		int a = in.nextInt(); 
		
		System.out.println(" Please enter height ");
		double heigh = in.nextDouble(); 
		
		
		System.out.println(" Thank you" + name + " for your number " + a +  " " + heigh );
		in.close();
		
		
		
	}

}
