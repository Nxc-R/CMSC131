package programs;
import java.util.Scanner;
import java.util.Random;

public class ThrowDie {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int die;
		//Ask for number of die throws
		System.out.print("How many times to throw a die?: ");
		int throwNum = scanner.nextInt();
		
		//Ask for seed
		System.out.print("Enter seed: ");
		int seed = scanner.nextInt();
		Random random = new Random(seed);
		
		//Throw die
		int throwCount = 1;
		while (throwCount <= throwNum) {
			die = (random.nextInt(6) + 1);
			System.out.println("Throw #" + throwCount);
			if (die == 1) {
				System.out.println("...\n.0.\n...");
			}
			else if (die == 2) {
				System.out.println("0..\n...\n..0");
			}
			else if (die == 3) {
				System.out.println("0..\n.0.\n..0");
			}
			else if (die == 4) {
				System.out.println("0.0\n...\n0.0");
			}
			else if (die == 5) {
				System.out.println("0.0\n.0.\n0.0");
			}
			else if (die == 6) {
				System.out.println("0.0\n0.0\n0.0");
			}
			throwCount++;
		} 
		scanner.close();

	}

}
