package programs;
import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		//Create Scanner Object
		Scanner scanner = new Scanner(System.in);
		
		//Input base
		System.out.print("Enter base: ");
		double base =  scanner.nextDouble();
		
		//Input height
		System.out.print("Enter height: ");
		double height =  scanner.nextDouble();
		
		//Compute area
		double triangleArea = (base * height)/2;
		
		System.out.print("Area is: " + triangleArea );
		
		//Close scanner
		scanner.close();
	}
}