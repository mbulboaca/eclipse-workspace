package AsciiDecoder;

import java.util.*;
import java.lang.*;
import java.util.Scanner;

public class AsciiDecoder {

	static void ASCIISentence(String str) {

		int l = str.length();
		int conv;

		for (int i = 0; i < l; i++) {

			conv = str.charAt(i);
			System.out.print("#" + conv);
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter your input");
		String str = sc.nextLine();

		System.out.println("For your input " + str + "the Ascii value is: ");
		ASCIISentence(str);

		System.out.println("Please enter your ascii code"); 

		
        
	}
		
	}

