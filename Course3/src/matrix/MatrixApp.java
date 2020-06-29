package matrix;
import java.util.Scanner;

public class MatrixApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfRows = sc.nextInt();
		sc = new Scanner(System.in);
		int noOfCols = sc.nextInt();
		sc = new Scanner(System.in);
		
		int[][] matrix = new int[noOfRows][noOfCols];
		System.out.println("Please insert matrix values:");
		//scriere valori inmatrice
		for(int i=0; i<noOfRows; i++) {
			for(int j=0; j<noOfCols; j++) {
				int val = sc.nextInt();
				sc = new Scanner(System.in);
				matrix[i][j] = val;
			}
		}
		
		//citire valori din matrice
		for(int i=0; i<noOfRows; i++) {
			for(int j=0; j<noOfCols; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
