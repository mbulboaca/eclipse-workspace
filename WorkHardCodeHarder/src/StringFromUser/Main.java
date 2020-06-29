package StringFromUser;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your number");

		int userInput = sc.nextInt();

		System.out.println("You have entered: " + userInput);
		sc.close();

	}

}
