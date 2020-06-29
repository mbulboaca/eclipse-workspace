import java.util.Scanner;

public class MultipleConvertor {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your number: ");

		double a = scanner.nextDouble();

		System.out.println("Number of minutes " + (a / 60));
		System.out.println("Number of hours " + (a / 3600));
		System.out.println("Number of days " + (a / (24 * 3600)));
		System.out.println("Number of years " + (a / (24 * 365 * 3600)));
		scanner.close();
	}

}
