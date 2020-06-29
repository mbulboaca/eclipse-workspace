package Swap2Numbers;

public class Main {

	public static void main(String[] args) {
		
		
		float a = 1.01f; 
		
		float b = 0.01f; 
		
		System.out.println("Before swipe");
		System.out.println("First number is " + a );
		System.out.println("Second number is " + b);
		
		float temp = a; // aici temp = 1.01
		
		a = b; // aici 0.01
		
		b = temp; // aici 1.01 -> Asta-i jonglare :))     
		
		
		System.out.println("After Swipe");
		System.out.println("First number is " + a );
		System.out.println("Second number is " + b);
	}

}
