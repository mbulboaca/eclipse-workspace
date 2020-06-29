import java.util.Scanner;

public class SumInput {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the elements:");

		int num = scanner.nextInt();
		int sum = 0;
		int avg = sum/num; 
		
		while (num > 0) {
			sum = sum + num % 10;
			num = num / 10;
		}
		System.out.println(sum);
		System.out.println(avg);
		scanner.close();
	}

}
