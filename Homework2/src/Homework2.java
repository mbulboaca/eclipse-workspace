import java.util.Scanner;

public class Homework2 {
        //2
	public static void main(String[] args) {

		long a = 2147483647;
		int b = 3;

		System.out.println(a + b);

		
		//3
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your text: ");
		String str = scanner.next();
		System.out.println("The lenght of your text is: " + str.length());
		scanner.close();
		
		//4
		Integer i = new Integer(19);
		String hex = Integer.toHexString(i); 
		System.out.println("The hexdecimal of int is " + hex);
		
		// 7
		float x = 32.55f;
		float z = 3f; 
		double y = (double)x/z; 
		System.out.println(y);
	}

}
