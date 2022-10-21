package programs;
import java.util.Scanner;

public class Convert {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		int remainder;
		String octVal ="";
		//Input decimal number
		System.out.println("Enter decimal number: ");
		int decimal = scanner.nextInt();
		
		//Compute Octal value
		if (decimal <= 0) {
			octVal = "0";
		}
		else {
			while (decimal > 0) {
				remainder = decimal % 8;
				octVal = remainder + octVal;
				decimal = decimal / 8;
			}
			
		}
		
		//Print Octal Value
		System.out.print("Octal value: " + octVal);
		
		//Close scanner
		scanner.close();
	}

}
