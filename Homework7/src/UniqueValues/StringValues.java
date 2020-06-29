package UniqueValues;

import java.util.Scanner;

public class StringValues {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		Unique obj = new Unique(); 
		System.out.println("Please enter your text");
		String input = sc.nextLine(); 
	
		if(obj.uniqueValues(input)) {
			System.out.println("Your input " + input + " has all unique values");
			
			
		}else
			System.out.println("Your input" + input + " has duplicate values");
		
	

	}
	

}
