package zoo;

import java.util.Scanner;

public class ZooApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Bears b1 = new Bears("Ghiocel", 8, "Mammal", "Europe");
		Crocodiles c1 = new Crocodiles("Dintisor", 69, "Reptile", "Asia");
		Elephants e1 = new Elephants("Dolofanu", 22, "Mammal", "Africa");
		Lions l1 = new Lions("Printisor", 44, "Mammal", "Asia");
		Lizard z1 = new Lizard("Alunecosu", 15, "Reptile", "Australia");
		Parrots p1 = new Parrots("Dick", 4, "Bird", "America");
		Penguins s1 = new Penguins("Spidi", 9, "Bird", "Antartica");

		Animals[] list = { b1, c1, e1, l1, z1, p1, s1 };
		while (true) {
			System.out.println("What animal you want to display?");
			String type = sc.nextLine();
			if (type.equalsIgnoreCase("bear")) {
				extracted(b1);

			} else if (type.equalsIgnoreCase("crocodile")) {
				extracted(c1);

			} else if (type.equalsIgnoreCase("elephant")) {
				extracted(e1);

			} else if (type.equalsIgnoreCase("lion")) {
				extracted(l1);

			} else if (type.equalsIgnoreCase("lizard")) {
				extracted(z1);

			} else if (type.equalsIgnoreCase("parrot")) {
				extracted(p1);

			} else if (type.equalsIgnoreCase("penguin")) {
				extracted(s1);

			} else if (type.equalsIgnoreCase("all")) {
				Zoo zoo = new Zoo(list);
				zoo.describeAll();
				System.out.println("Thank you for using our App");
				break;
			}else {
				
				System.out.println("Not register yet");
			
		
			}

		}
	}

	private static void extracted(Penguins s1) {
		System.out.println("Name of the animal: " + s1.name);
		System.out.println("Age of the animal: " + s1.age + " years");
		System.out.println("Type: " + s1.type);
		System.out.println("Origin: " + s1.origin);
	}

	private static void extracted(Parrots p1) {
		System.out.println("Name of the animal: " + p1.name);
		System.out.println("Age of the animal: " + p1.age + " years");
		System.out.println("Type: " + p1.type);
		System.out.println("Origin: " + p1.origin);
	}

	private static void extracted(Lizard z1) {
		System.out.println("Name of the animal: " + z1.name);
		System.out.println("Age of the animal: " + z1.age + " years");
		System.out.println("Type: " + z1.type);
		System.out.println("Origin: " + z1.origin);
	}

	private static void extracted(Lions l1) {
		System.out.println("Name of the animal: " + l1.name);
		System.out.println("Age of the animal: " + l1.age + " years");
		System.out.println("Type: " + l1.type);
		System.out.println("Origin: " + l1.origin);
	}

	private static void extracted(Elephants e1) {
		System.out.println("Name of the animal: " + e1.name);
		System.out.println("Age of the animal: " + e1.age + " years");
		System.out.println("Type: " + e1.type);
		System.out.println("Origin: " + e1.origin);
	}

	private static void extracted(Crocodiles c1) {
		System.out.println("Name of the animal: " + c1.name);
		System.out.println("Age of the animal: " + c1.age + " years");
		System.out.println("Type: " + c1.type);
		System.out.println("Origin: " + c1.origin);
	}

	private static void extracted(Bears b1) {
		System.out.println("Name of the animal: " + b1.name);
		System.out.println("Age of the animal: " + b1.age + " years");
		System.out.println("Type: " + b1.type);
		System.out.println("Origin: " + b1.origin);
	}
}
