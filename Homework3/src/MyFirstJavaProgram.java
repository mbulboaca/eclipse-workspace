import java.util.Scanner;

public class MyFirstJavaProgram {

	public static void main(String[] args) {
		while (true) {

			String[] words = { "This ", "is ", "a ", "Java ", "scramble ", "game " };

			System.out.println("The scramble phrase is: ");

			System.out.println(words[4] + words[0] + words[2] + words[3] + words[1] + words[5]);

			Scanner in = new Scanner(System.in);

			String firstWord = in.nextLine();

			System.out.println("You typed : " + firstWord);

			boolean isTrue = firstWord.equals("This is a Java scramble game");
			
			if (isTrue) {
				System.out.println("You won!");
				System.out.println(
						"The scrambled phrase is: " + words[0] + words[1] + words[2] + words[3] + words[4] + words[5]);

			} else {
				System.out.println("You lost!");
				System.out.println("The scrambled phrase is: " + words[0] + words[1] + words[2] + words[3] + words[4] + words[5]);

			}
			break;
			
		}

	}
}
