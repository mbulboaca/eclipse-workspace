
public class ClasaPrincipala {

	public static void main(String[] args) {
		
		Integer x = new Integer(5);
		int y = 0;
		System.out.println(x.toString() + "tare");
		System.out.println(y);
		
		String a = new String("abc");
		String b = a.substring(0, 1);
		
		System.out.println(a + "vs." + b);
		
		clasamea ob1 = new clasamea(); 
		
		ob1.x = 10;
		ob1.a = "Ramon";
		
		System.out.println(ob1.numeleMeu(ob1.a) + "numarul este"+ ob1.x);
	}

}
