import java.util.Scanner;

public class PositiveNegative {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your value:");
		int a = sc.nextInt();

		if (a > 0) {

			System.out.println("The number " + a + " is positive");
		} else if (a < 0) {

			System.out.println("The number " + a + " is negative");
		}else {
			
			System.out.println("Error");
		}
		sc.close();
	}
}
