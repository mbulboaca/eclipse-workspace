
public class Raul {

	String name;
	int age;
	double height;
	double weight;

	@Override
	public String toString() {
		return "Raul [name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight + "]";
	}

	public static void main(String[] args) {

		Raul baiat = new Raul();
		baiat.age = 13;
		baiat.name = "Raul";
		baiat.weight = 61.5;
		baiat.height = 175.0;

		System.out.println(baiat);
		int x = 20; 
		int y = 3; 
		int z = x%y; 
		System.out.println(z);
	}

}