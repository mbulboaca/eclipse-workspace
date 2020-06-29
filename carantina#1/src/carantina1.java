
public class carantina1 {

	public static void main(String[] args) {
		
		
		System.out.println("Salut");
		
		String name = new String("Test nume");
		int Valoare = Hello(name,1 ,2); 
		System.out.println(Valoare);
		String temp = nameUser("Ramon"); 
		
		System.out.println(temp.length() + "Toate caracterele" + "\n" + "sirul total" + name );
	}

	
	public static int Hello(String name, int a, int b) {
	
		int sum = a + b; 
		
		System.out.println("Salutare" + name + "!");
	
		return sum; 
	}
	
	
	public static String nameUser(String name) {
	
	String ret = "Numele tau este" + name;
	return ret; 
	}
	
}

	
