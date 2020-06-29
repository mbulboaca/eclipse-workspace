
public class Animal {

	double height;
	double weight;
	String type;
	String bloodType;
	public Animal(double height, double weight, String type, String bloodType) {
		super();
		this.height = 0;
		this.weight = 0;
		this.type = "unknown";
		this.bloodType = "unknown";
	}
	
	public String ShowInfo() {
		return "Animal [height=" + height + ", weight=" + weight + ", type=" + type + ", bloodType=" + bloodType + "]";
	} 
	

	
}
