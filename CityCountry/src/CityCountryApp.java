
public class CityCountryApp {

	public static void main(String[] args) {
		
		Country c = new Country(); 
		c.continent = " Europa"; 
		c.name = "Romania"; 
		
		
		City a = new City(); 
		a.name = "Bucuresti"; 
		a.district = "Ilfov"; 
		a.noOfPeople = 2000001;				
		a.country = c;
		
		
		a.describe();	
		
	}	
}
