import java.util.Scanner;

public class VowelConsonantApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your char: ");

		char ch = scanner.next().charAt(0);
		int i = 0;

		switch (ch) {
		case 'a': 
		case 'e': 
		case 'i': 
		case 'o': 
		case 'u': 
		case 'A': 
		case 'E': 
		case 'I': 
		case 'O': 
		case 'U': i++;	
		}

		if (i == 1)
			System.out.println("Pula lui de caracter " + ch + " is  Vowel");
		else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
			System.out.println("Pula lui de caracter " + ch + " is Consonent");
		else
			System.out.println("Not an alphabet");
		
	}
	
	
}
