
public class InterlvalApp {

	public static void main(String[] args) {
	int n = 4;
	
	switch(n) { 
	case 0:
	case 1: 
	case 2: 
	case 3: System.out.println("[0-3]"); break;
	case 4: 
	case 5: System.out.println("[4-7]"); break;
	case 6: 
	case 7: System.out.println("[6-7]"); break;
	case 8: System.out.println("[8-8]"); break;
		default: System.out.println("Other");
	
		}

	}

}
