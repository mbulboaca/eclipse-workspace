
public class Problems {

	public static void main(String[] args) {

		//9
		int a = 1000000000;
		long b =(long) a;

		System.out.println(a);

		a = a + a;
		System.out.println(a);

		b = (long) a + a;
		System.out.println(b);
		
		//8 
		
		double x = Math.sqrt(81);
				System.out.println(x);
		double z = Math.sqrt(((5 / 2 + 3) - 6 * 8 / 3) / 2 + 3 ); //NaN - the output is negative 
		
		System.out.println(z);
		
	}
}
