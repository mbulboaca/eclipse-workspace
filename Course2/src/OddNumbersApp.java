
public class OddNumbersApp {

	public static void main(String[] args) {
		for(int i = 1; i<=10; i=i+2) {
			System.out.println(i);
		}
		
		for(int i = 0; i <= 10; i++) {
			if(i%2 == 1) {
				System.out.println(i);
			}
		}
		
		int i = 1;
		while(i <= 10) { 
			System.out.println(i);
			i = i+2; 
			
		}
		
		for(int j = 100; j>15; j--) {
			if(j%10 == 0) {
			System.out.println(j);
			
			}
		}
	}
	
}
