package cofferestaurant;

import java.util.Scanner;

public class Restaurant {


		public static void main(String[] args) {
			Scanner read = new Scanner(System.in);
			System.out.println("How much degrees should your coffee have?");
			int degrees = read.nextInt();
			Coffee c = new Coffee(degrees);
			try {
				c.analyze();
				int number = (int) (Math.random() * 4 + 1);
				if( number == 1)
					System.out.println("Clientul a plecat aiurea. " );
				else
					System.out.println("Clientul a fost multumit.");
			} catch(Exception e) {
				System.out.println(e.getMessage());
			}
			read.close();
		}
	}

