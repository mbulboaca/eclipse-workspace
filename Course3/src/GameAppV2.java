import java.util.Random;
import java.util.Scanner;

public class GameAppV2 {
	public static void main(String[] args) {

		
			Random rand = new Random();
			int numberToGuess = rand.nextInt(10);
			System.out.println("Hint:" + numberToGuess);
			
			Scanner sc = new Scanner(System.in);
			
			
			System.out.println("Plase insert your name:");
			String name = sc.nextLine();
			
			System.out.println("Please insert the number of tries:");
			int tries = sc.nextInt();
			sc = new Scanner(System.in);
			
			int[] listOfNumbers = new int[tries];
			
			for(int i=0; i<tries; i++) {
				System.out.println("Please insert your number:");
				int number = sc.nextInt();
				sc = new Scanner(System.in);
				listOfNumbers[i] = number;
				
				if(number == numberToGuess) {
					System.out.println("Congratulations! You WON!!");
					break;
				} else {
					if(i==tries-1) {
						gameOver(numberToGuess, listOfNumbers);
					} else {
						System.out.println("Sorry," + name + "! Please try again!\n");
					}
				}
			}
		}

		private static void gameOver(int numberToGuess, int[] listOfNumbers) {
			System.out.println("GAME OVER! The number was:" + numberToGuess );
			System.out.println("Your numbers were: ");
			for(int j=0; j<listOfNumbers.length; j++) {
				System.out.print(listOfNumbers[j] + " ");
			}
		}
	}
