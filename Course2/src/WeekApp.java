import java.util.Scanner;

public class WeekApp {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		int n = in.nextInt();
		
		switch(n) { 
		case 1: System.out.println("Luni"); break;
		case 2: System.out.println("Marti"); break;
		case 3: System.out.println("Miercuri"); break;
		case 4: System.out.println("Joi"); break;
		case 5: System.out.println("Vineri"); break;
		case 6: System.out.println("Sambata"); break;
		case 7: System.out.println("Duminica"); break;
		default: System.out.println("Error!");
		}
		
	}

}
