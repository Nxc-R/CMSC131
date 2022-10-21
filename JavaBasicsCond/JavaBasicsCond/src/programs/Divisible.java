package programs;
import java.util.Scanner;

public class Divisible {

	public static void main(String[] args) {
		//Create Scanner Object
		Scanner scanner = new Scanner(System.in);
		
		//Input x
		System.out.print("Enter x: ");
		int x = scanner.nextInt();
		
		//Input y
		System.out.print("Enter y: ");
		int y = scanner.nextInt();
		
		//Compute remainder
		System.out.println("Remainder: " + x % y);
		
		//Determine if x is divisible by y
		if (x % y == 0) {
			System.out.println(x + " is divisible by "+ y);
		}
		else {
			System.out.println(x + " is NOT divisible by "+ y);
		}
		
		//Close scanner
		scanner.close();
	}
}