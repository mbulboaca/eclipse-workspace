package bookstore;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
	
	static ArrayList<Book> books = new ArrayList<Book>();
	static Scanner read = new Scanner(System.in);
	
	public static void registerBook() {
		Book book;
		int price, qty;
		String date, name, authorName, authorSurname, authorDate;
		
		System.out.println("Enter the name of the book: ");
		read.nextLine();
		name = read.nextLine();
		
		System.out.println("Enter the price of the book: ");
		price = read.nextInt();
		
		System.out.println("Enter the date of the book (dd/mm/yy) ");
		read.nextLine();
		date = read.nextLine();
		
		System.out.println("Enter the quantity of the book");
		qty = read.nextInt();
		
		System.out.println("Enter author's name: ");
		read.nextLine();
		authorName = read.nextLine();
		
		System.out.println("Enter author's surname");
		authorSurname = read.nextLine();
		
		System.out.println("Enter author's date of birth");
		authorDate = read.nextLine();
		
		Author author = new Author(authorName, authorSurname, authorDate);
		book = new Book(name, price, date, author, qty);
		books.add(book);
	}
	
	public static void showOptions() {
		System.out.println("Enter 1 to register a book");
		System.out.println("Enter 2 to search for a book");
		System.out.println("Enter 0 to leave the app.");
	}
	
	public static void showSearchOptions() {
		System.out.println("Enter 1 to search by name");
		System.out.println("Enter 2 to search by author name");
		System.out.println("Enter 3 to search by date");
	}
	
	public static void search(String criteria, int option) {
		for(Book book : books) {
			if(option == 1) {
				if(criteria == null)
					System.out.println("Criteriu nul!!!");
				if(book.name.equalsIgnoreCase(criteria)) {
					book.showInfo();
					break;
				}
			}
			if(option == 2)
				if(book.author.name.equalsIgnoreCase(criteria)) {
					book.showInfo();
					break;
				}
			if(option == 3) 
				if(book.date.equalsIgnoreCase(criteria)) {
					book.showInfo();
					break;
				}
		}
		
	}
	
	public static void main(String[] args) {
		int option, searchOption;
		System.out.println("Hello! Welcome to our library.");
		System.out.println("Choose an action!");
		
		Author author1 = new Author("Francezu", "Mirel", "1972");
		Author author2 = new Author("Tataru", "Alexeiciuc", "1995");
		Author author3 = new Author("Colt", "Costica", "1987");
		Author author4 = new Author("Dascalu", "Pictor", "1994");
		Author author5 = new Author("Stan", "Marius", "1908");
		
		Book book1 = new Book("Azi", 100, "2007", author1, 7);
		Book book2 = new Book("Maine", 200, "2008", author2, 3);
		Book book3 = new Book("Ieri", 150, "2009", author3, 17);
		Book book4 = new Book("Abstracte", 120, "2004", author4, 23);
		Book book5 = new Book("Ceva", 180, "2005", author5, 2);
		
		books.add(book1);
		books.add(book2);
		books.add(book3);
		books.add(book4);
		books.add(book5);
		
		while(true) {
			showOptions();
			option = read.nextInt();
			if(option == 1)
				registerBook();
			if(option == 2) {
				showSearchOptions();
				searchOption = read.nextInt();
				if(searchOption == 1) {
					System.out.println("Enter the name of the book: ");
					read.nextLine();
					String criteria = read.nextLine();
					System.out.println("Criteriul este " + criteria);
					search(criteria, searchOption);
				}
				if(searchOption == 2) {
					System.out.println("Enter author's name: ");
					read.nextLine();
					String criteria = read.nextLine();
					search(criteria, searchOption);
				}
				if(searchOption == 3) {
					System.out.println("Enter the date of the book (dd/mm/yy) ");
					read.nextLine();
					String criteria = read.nextLine();
					search(criteria, searchOption);
				}
			}
			if(option == 3) {
				System.out.println("Thank you for using our app");
				break;
			}
		}

	}

}
