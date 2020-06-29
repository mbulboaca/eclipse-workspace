import java.util.Random;
import java.util.Scanner;
public class RockPapperScissor {

	public static String generateComputerChoice( Random random ) {
		int wordNumber;
		wordNumber = random.nextInt( 3 ) + 1;
		String computerWordChoice = ""; 
		
		if( wordNumber == 1) {
			computerWordChoice = "piatra"; 
		} else if(wordNumber == 2) {
			computerWordChoice = "hartie";
		} else if(wordNumber == 3) {
			computerWordChoice = "foarfece";
		
		}
		System.out.println("B-Boy Emil");
		return computerWordChoice; 
	}
		public static void showMenu( ) {
			System.out.println("1. piatra\n2. hartie\n3. foarfece");
		}
		
		public static String getUserChoice( Scanner scanner ) {
			String userWordChoice; 
			
			System.out.println("Emi, da-i ultimata");
			userWordChoice = scanner.nextLine();
		
			return userWordChoice;
		}
		public static String chooseWinner(String computerChoice, String userChoice) {
			String winner = "inceput de sfarsit"; 
			String customMessage= ""; 
			String finalMessage; 
			
			String rockCustomMessage = " Piatra strica foarfeca, ai pus-o"; 
			String scissorCustomMessage = " Foarfeca taie hartia, ai pus-o";
			String paperCustomMessage = " Hartia crapa piatra, ai pus-o"; 
			
			
			if(computerChoice.equals("piatra") && userChoice.equalsIgnoreCase("foarfece")) {
				winner = "Covid-19"; 
				customMessage = rockCustomMessage; 
				
			} else if(computerChoice.equalsIgnoreCase("piatra") && userChoice.equals("foarfece")) {
				winner = "Emi"; 
				customMessage = rockCustomMessage; 
			}
		
			if(computerChoice.equals("foarfece") && userChoice.equalsIgnoreCase("hartie")) {
				winner = "Covid-19"; 
				customMessage = scissorCustomMessage; 
				
			} else if(computerChoice.equalsIgnoreCase("foarfece") && userChoice.equals("hartie")) {
				winner = "Emi"; 
				customMessage = scissorCustomMessage; 
		
			}	
			
			if(computerChoice.equals("hartie") && userChoice.equalsIgnoreCase("piatra")) {
				winner = "Covid-19"; 
				customMessage = paperCustomMessage; 
				
			} else if(computerChoice.equalsIgnoreCase("hartie") && userChoice.equals("piatra")) {
				winner = "Emi"; 
				customMessage = paperCustomMessage; 
			}	
			
			finalMessage = winner + customMessage ; 
	      	if(finalMessage.equals("Remiza")) {
	      		finalMessage = "Remiza"; 
	      		return finalMessage;	
	      	} else {
	      		return finalMessage; 
	      	}
		    
		}
		
		
		public static void main(String[] args) {
		
			Random random = new Random();
			Scanner scanner = new Scanner(System.in);
			String computerChoice;
			String userChoice; 
			String winner; 
		
			showMenu(); 
			computerChoice = generateComputerChoice(random);
			userChoice = getUserChoice( scanner ); 
			winner = chooseWinner(computerChoice, userChoice); 
			
			System.out.println("Ai ales " + userChoice + "\Bboy Emil a ales " + computerChoice); 
			System.out.println(winner);
			
			while(winner.equals("Remiza")) {
				System.out.println("Remiza fraerilor! ");
				showMenu();
				computerChoice = generateComputerChoice(random); 
				userChoice = getUserChoice(scanner); 
				winner = chooseWinner( computerChoice, userChoice); 
				System.out.println("Ai ales " + userChoice + "\Bboy Emil" + computerChoice);
				System.out.println(winner);
			}
		
		}

	
	
}
