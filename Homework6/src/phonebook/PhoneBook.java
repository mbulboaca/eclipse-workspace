package phonebook;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBook {

	static ArrayList<Person> phoneBook = new ArrayList<>();
	static Scanner read = new Scanner(System.in);
	static void add() {
		String name, address, phone;
		System.out.println("Introduceti numele personei");
		name = read.nextLine();
		System.out.println("Introduceti adresa");
		address = read.nextLine();
		System.out.println("Introduceti telefonul");
		phone = read.nextLine();
		phoneBook.add(new Person(name, address, phone));
	}
	
	static void remove(String phone) {
		for(Person p : phoneBook) {
			if(p.phone.equals(phone))
				phoneBook.remove(p);
		}
	}
	public static void main(String[] args) {
		int option;
		while(true) {
			System.out.println("Choose an option;");
			System.out.println("1-add/2-remove/3-search/4-exit");
			option = read.nextInt();
			if(option == 1)
				add();
			if(option == 2) {
				System.out.println("Introduceti numarul de telefon pe care vreti sa;  pl");
				remove(read.nextLine());
			}
			if(option == 3)
				
			if(option == 4)
				break;
		}
	}
}
