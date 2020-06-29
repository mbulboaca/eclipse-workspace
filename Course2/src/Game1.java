import java.util.Scanner;

public class Game1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		
		System.out.println("please insert yout name");
		String name1 = in.nextLine();
		System.out.println("Please insert your number");
		int number1 = in.nextInt();
		in = new Scanner(System.in);
		
	
		System.out.println("please insert yout name");
		String name2 = in.nextLine();
		System.out.println("Please insert your number");
		int number2 = in.nextInt();
		in = new Scanner(System.in);
		
		if(number1 > number2) {
			System.out.println(name2 + " Won! ");
		}else if(number1 < number2) {
			System.out.println(name1 + " Won! ");	
		}else {
			System.out.println("tie!");
		}
		
		
	}

}
