package ex2;

public class A {

	void ofMethodA() {
		System.out.println("Class A");
	}

	public class B extends A {
		void ofMethodA() {
			System.out.println("Class B");
		}

	}
}
