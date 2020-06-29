import java.math.BigDecimal;

public class Variables {

	public static void main(String[] args) {
		int value1 = 1;
		int value2 = 2;
		int value3 = value1*value2*value2;
		System.out.println(value3);

		
		// Big Decimal 
		double x = 1.05;
		double y = 2.55;
		BigDecimal d1 = new BigDecimal("1.05");
		BigDecimal d2 = new BigDecimal("2.55");
				
		System.out.println(d1.add(d2));
		
		String var = "Hello World! \u00BB"; 
		
		
		System.out.println(var);
		
		String var1 = new String("10"); 
		String var2 = "20"; 
		System.out.println(var1+var2);
		
		
	}

}
