
import java.util.Scanner;
public class HauntedMansion {
	
	public static void main(String[] args) {
		
		String choice; Scanner user_in = new Scanner (System.in);
		System.out.println("Welcome to my hounted house");
	
		String choice = user_in.nextLine();
		
		
		if(choice.equals("upstairs")){ System.out.println("You are now upstairs."); 
		else if(choice.equals("right")){ System.out.println("You are now in the kitchen"); } 
		else if(choice.equals("left")){ System.out.println("You are now in the dining room"); }
		else { System.out.println("That was not valid"); }
		
	

	}

}
