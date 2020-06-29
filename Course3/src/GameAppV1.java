import java.util.Random;
import java.util.Scanner;

public class GameAppV1 {
	public static void main(String[] args) {

		Random rand = new Random();
		int numToGuess = rand.nextInt(10);
		System.out.println("Hint " + numToGuess);

		Scanner sc = new Scanner(System.in);
		System.out.println("Insert your name");
		String name = sc.nextLine();

		for (int i = 0; i < 3; i++) {
			System.out.println("Enter your number");
			int num = sc.nextInt();
			sc = new Scanner(System.in);

			if (num == numToGuess) {
				System.out.println("Congratz, you won");
				break;
			} else {
				System.out.println("Sorry " + name + " Try again");
				if (i == 2) {
					System.out.println("GAME OVER! The number was: " + numToGuess);
				} else {
					System.out.println("Sorry " + name + " Try again!\n");

				}
			}

		}

	}
}