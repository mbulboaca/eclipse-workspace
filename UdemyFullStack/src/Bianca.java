import java.util.Scanner;

public class Bianca {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in); 
		
		

		
		System.out.println("Cum o cheama pe sarbatorita?");
		
		String name = sc.nextLine(); 
		
		System.out.println("Si cati ani face " + name + " ?");
		
		int age = sc.nextInt(); 
		
		 
		if (age == 25) {
			
		int a = age; 
		long sum = (365 * (3600 * 24 ) * a);
		System.out.println("La multi ani !!!" + name + " ai facut " + age + " sau " + sum + " secunde");

		}else
			System.out.println("Bai lasa vrajeala");
		
		
		
	}
}
