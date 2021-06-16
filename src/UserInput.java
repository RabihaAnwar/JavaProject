import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*
		 * System.out.println("Enter a decimal: "); double dval = input.nextDouble();
		 * System.out.println("Your decimal value is: " + dval);
		 */
		
		int val = 0;
		do {
			System.out.println("Enter a number: ");
			val = input.nextInt();
		}
		
		while (val != 9); {
			System.out.println("You can't enter 9!");
		}
		
			
	}
}
