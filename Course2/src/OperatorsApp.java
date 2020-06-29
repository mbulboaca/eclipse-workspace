import java.util.Scanner;

public class OperatorsApp {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println(" Please insert your age ");
		int age = in.nextInt();
		in = new Scanner(System.in);
		
		
		System.out.println(" Please insert your income ");
		double income = in.nextDouble();
		in = new Scanner(System.in); 
		
		System.out.println(" Please insert your gender");
		boolean gender = in.hasNext(); 
		
		boolean ageAccepted = age > 20 && age < 35;
		String message = ageAccepted ? " You are accepted" : " please try later" ; 
		System.out.println(message);
		
		boolean incomeAccepted = (gender == false && income > 4000) || (gender == true && income > 5000);
		String message2 = incomeAccepted ? "You are Accepted" : "Please try later"; 
		System.out.println(message2);
		
		System.out.println(ageAccepted && incomeAccepted ? " Final accept " : " rejected ");
		
		if(!(ageAccepted && incomeAccepted)) {
			System.out.println("Finaly"); 
			
		} else {
			System.out.println("rejected");
			
			
		}
		
		if(ageAccepted && !incomeAccepted) {
			System.out.println("Jusy for age");
		} else if(!ageAccepted && incomeAccepted) {
			System.out.println("Just for income");
			
		}else if(ageAccepted && incomeAccepted) {
			System.out.println("both of them accepted");
			
		}	else
				System.out.println("none accepted");
		
	}
	

}
