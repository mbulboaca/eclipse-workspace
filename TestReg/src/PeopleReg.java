import java.util.Scanner;

public class PeopleReg {

	public static void main(String[] args) {
		

		Integer peopleReg = 10;
		People[] reg = new People[peopleReg];
		int i = 0;
		String name = "";
		String age = "";
		
		
		 
		while (i < peopleReg) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Please tell me your name");
			name = sc.nextLine();
			if(name.equals("exit"))  {
				break;
			}
			System.out.println("Hello " + name + " please enter your age");
			age = sc.nextLine();
			System.out.println("Thank you " + name + " for your registration");
			People regp = new People(name, age);
			reg[i] = regp;
			i++;
			
		} 
	
		System.out.println("Bellow you have people registred");
		System.out.println("Name"+ "   " + "age");
		for (People regp : reg) {
		
			regp.describe();

		}
	}

}
