package programs;

import java.util.Scanner;

public class ColorGenerator {

	public static void main(String[] args) {
		//Create Scanner Object
		Scanner scanner = new Scanner(System.in);
		
		//Create string for final color value, red color component and green and blue color component
		String finalColor = "#", redVal, grnAndBlueVal;
		
		//Ask user if they want red
		System.out.print("Do you want red? (Yes/Yeah/No): ");
		String redColor = scanner.next();
		
		//Ask user if they want green and blue
		System.out.print("Do you want green and blue? (Yes/Yeah/No): ");
		String grnAndBlue = scanner.next();
		
		//Compute CSS color
		if ((redColor.equals("Yes") || redColor.equals("Yeah")) && (grnAndBlue.equals("Yes") || grnAndBlue.equals("Yeah"))) {
			redVal ="FF";
			grnAndBlueVal = "FFFF";
			finalColor += redVal + grnAndBlueVal;
		}
		else if ((redColor.equals("Yes") || redColor.equals("Yeah")) && !(grnAndBlue.equals("Yes") || grnAndBlue.equals("Yeah"))) {
			redVal ="FF";
			grnAndBlueVal = "0000";
			finalColor += redVal + grnAndBlueVal;
		}
		else if (!(redColor.equals("Yes") || redColor.equals("Yeah")) && (grnAndBlue.equals("Yes") || grnAndBlue.equals("Yeah"))) {
			redVal ="00";
			grnAndBlueVal = "FFFF";
			finalColor += redVal + grnAndBlueVal;
		}
		else if (!(redColor.equals("Yes") || redColor.equals("Yeah")) && !(grnAndBlue.equals("Yes") || grnAndBlue.equals("Yeah"))) {
			redVal ="00";
			grnAndBlueVal = "0000";
			finalColor += redVal + grnAndBlueVal;
		}
		
		//Print CSS Color
		System.out.println("Final Color: " + finalColor);
		
		//Close Scanner
		scanner.close();
	}
}