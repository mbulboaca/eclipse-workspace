package collections;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentsApp {

	public static void main(String[] args) {
		//String[] list = new String[100]; 
		ArrayList<Object> list = new ArrayList<>();
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Please insert a student name: ");
			String name = sc.nextLine();
			if (name.equalsIgnoreCase("Exit")) {
				break;
			}
			list.add(name);
		}
		System.out.println(list);
		Scanner sc = new Scanner(System.in);
		System.out.println("Please insert a student name to remove ");
		String nameToRemove = sc.nextLine();
		list.remove(nameToRemove);
		
		
		System.out.println("Please insert a student name to remove ");
		String nameToReplace = sc.nextLine();
		System.out.println("Student name to add ");
		String nameToAdd = sc.nextLine();
		
		int index = list.indexOf(nameToReplace);
		list.set(index, nameToAdd); 
		System.out.println(list);
		
	}

}
