import java.util.Scanner;

public class HexagonArea {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of a side of the hexagon: ");
        double s = sc.nextDouble();
        System.out.print("The area of the hexagon is: " + hexagonArea(s)+"\n");
        
    
    }
    public static double hexagonArea(double s) {
        return (6*(s*s))/(4*Math.tan(Math.PI/6));
        
    }
    
}
	

