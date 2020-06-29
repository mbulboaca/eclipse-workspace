package car;

public class Engine {

	String name;
	int power;

	Engine(String n, int p) {
		name = n;
		power = p;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	@Override
	public String toString() {
		return "Engine [name=" + name + ", power=" + power + "]";
	}

}
