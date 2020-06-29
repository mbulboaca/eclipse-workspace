package bookstore;


public class Book {
	int price;
	String date, name;
	Author author;
	int quantity;
	
	public Book(String name, int price, String date, Author author, int qty) {
		this.name = name;
		this.price = price;
		this.date = date;
		this.author = author;
		this.quantity = qty;
	}
	
	public void showInfo() {
		System.out.println(name + " " + date + " " + price + " " + quantity + " " + author);
	} 
}
