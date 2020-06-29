import java.util.Scanner;

public class AsciiCalc {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Press a Keyboard: ");
		char ch = scanner.next().charAt(0);
		int asciiCode = ch;
		System.out.println("The ASCII value of " + ch + " is: " + asciiCode);
		scanner.close();
	}
}
