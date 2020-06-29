import java.util.Scanner;

public class PeopleReg {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	
		int n = 0;
		int[] ageList = new int[0];

		
		String[] nameList = new String[0];
		
		for (int i = 1; i > 0; i++) {

			System.out.println("Please tell me your name: ");
			String name = in.nextLine();

			nameList[i] = name;

			System.out.println("Hello " + name + ", please enter your age:");
			int age = in.nextInt();

			ageList[i] = age;

			System.out.println("Thank you " + name + ", for your registration");
			
			boolean exit = name.equals("exit");

			if (!exit) {

				System.out.println("Bellow you have " + nameList.length);

			} else {
				break;

			}
		}
	}
}