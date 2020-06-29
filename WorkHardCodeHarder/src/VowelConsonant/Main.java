package VowelConsonant;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		char ch = 'o'; 
		
		
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
			
			System.out.println("The char " + ch + " it's a vowel");
		
		else 
			
			System.out.println("The char " + ch + " it's a consonant");
		

	}

}
