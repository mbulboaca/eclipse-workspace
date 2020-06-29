package country;

import java.util.Set;
import java.util.TreeSet;

public class CountryApp {

	public static void main(String[] args) {

		Set<Country> country = new TreeSet<Country>();
		Country c1 = new Country("Romania", "Europe", 20000000);
		Country c2 = new Country("Japan", "Asia", 15000000);
		Country c3 = new Country("Egypt", "Africa", 50000000);
		Country c4 = new Country("Argentina", "South America", 40000000);

		country.add(c1);
		country.add(c2);
		country.add(c3);
		country.add(c4);

		Set<Country> country2 = new TreeSet<Country>();
		Country cc1 = new Country("U.K", "Europe", 55000000);
		Country cc2 = new Country("Germany", "Europe", 45000000);
		Country cc3 = new Country("Iran", "Africa", 25000000);
		Country cc4 = new Country("Denmarkr", "Europe", 30000000);

		country2.add(cc1);
		country2.add(cc2);
		country2.add(cc3);
		country2.add(cc4);
		
		country.addAll(country2);
	
		for(Country c:country) {
			System.out.println(c);
		}
	}

}
