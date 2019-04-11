import java.util.Scanner;

/*
 * The code creates an AddUserInput class.
 * It sums user-input numbers.
 * When the user inputs a zero, print out the sum and then terminate.
 */

public class AddUserInput {
	public static void main(String[] args) {
	    float userInput;
		float total = 0;
		Scanner in = new Scanner(System.in);
        HEAD
		/* ask a user to type a number */
        84eb15e998821ecbd874b3f2fd943a95da8ff5a0
		System.out.println("Please enter a number:");
		userInput = in.nextFloat();

		if (userInput == 0) {
			System.out.println();
		}
		else {
			do {total += userInput;
					System.out.println("Please enter another number:");
					userInput = in.nextFloat();
			} while(userInput != 0);

			System.out.println("The total of your input is " + total);
		}



		in.close();
	}
}
