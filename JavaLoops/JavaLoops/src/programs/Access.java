package programs;

import java.util.Scanner;

public class Access {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String passwd, correctPass = "terps";
		int num, correctNum = 1847, tries = 0;
			do {
				//Input password
				System.out.print("Enter password: ");
				passwd = scanner.next();
				
				if ((passwd.equals("quit")) || (passwd.equals("Quit"))) {
					System.out.print("Access Denied");
					return;
				}
				else {
					//Input Number
					System.out.print("Enter number: ");
					num = scanner.nextInt();
					if (!(passwd.equals(correctPass)) || (!(num == correctNum))) {
						System.out.println("Wrong credentials");
					}
					tries++;
				}
			} while (!(passwd.equals(correctPass)) || (!(num == correctNum)) && (tries < 3));
				if((passwd.equals(correctPass)) && (num == correctNum)) {
					System.out.print("Access Granted");
				}
				else {
					System.out.print("Access Denied");
				}
				scanner.close();
			
				
	}
		

}
