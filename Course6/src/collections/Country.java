package collections;

public class Country {

	String name; 
	String Continent;
	int noOfPeople;
	
	
	
	public Country(String name, String continent, int noOfPeople) {
		super();
		this.name = name;
		Continent = continent;
		this.noOfPeople = noOfPeople;
	}



	@Override
	public String toString() {
		return "Country [name=" + name + ", Continent=" + Continent + ", noOfPeople=" + noOfPeople + "]";
	} 
	
}
