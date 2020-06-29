package collections;

import java.util.Map;
import java.util.TreeMap;

public class CountriesApp {

	public static void main(String[] args) {
		 
		Map<String, Country> map = new TreeMap<>(); 
		Country c1 = new Country("Romania", "Europa", 23000000);
		map.put(c1.name, c1);
		Country c2 = new Country("Bulgaria", "Europa", 4000000);
		map.put(c2.name, c2);
		Country c3 = new Country("Germania", "Europa", 400000);
		map.put(c3.name, c3);
		
		for(Map.Entry<String, Country> m :  map.entrySet()) {
			System.out.println(m.getValue());
		}
		

	}

}
