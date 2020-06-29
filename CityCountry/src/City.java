
public class City {
	String name; 
	String district; 
	int noOfPeople; 
	Country country;
	
		
	public void describe() {
		System.out.println(name + " from " + district + " has a popoulation of: " + noOfPeople + country.name + country.continent);	 
	}	
}