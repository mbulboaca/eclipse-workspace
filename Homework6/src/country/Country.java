package country;

public class Country implements Comparable<Country> {

	private String name;
	private String continent;
	private int population; 
	
	public Country() {
		
	}

	public Country(String name, String continent, int population) {
		super();
		this.name = name;
		this.continent = continent;
		this.population = population;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	@Override
	public String toString() {
		return "Country [name=" + name + ", continent=" + continent + ", population=" + population + "]";
	}

	@Override
	public int compareTo(Country o) {
		
		return this.getName().compareToIgnoreCase(o.getName());
	}
	
}
	
	
		
	