/* CS 1301/9
 * Fall 2017   
 * Name: Aidan Murphy	
 * Instructor: Monisha Verma
 * Assignment: Lab 2
*/

package Lab_2;
import java.util.Scanner;
public class Lab_2_4 {
	
	public static void main(String[] args) {
		//declaring the value of coins in constants
		final int q_value = 25;
		final int n_value = 5;
		final int d_value = 10;
		final int p_value = 1;
		//creating scanner
		Scanner s = new Scanner(System.in);
		//receive input from user and display value back to them
		System.out.println("How many quarters do you have?");
		int q_num = s.nextInt();
		System.out.println("You entered " + q_num + " quarters");
		System.out.println("How many nickels do you have?");
		int n_num = s.nextInt();
		System.out.println("You entered " + n_num + " nickels");
		System.out.println("How many dimes do you have?");
		int d_num = s.nextInt();
		System.out.println("You entered " + d_num + " dimes");
		System.out.println("How many pennies do you have?");
		int p_num = s.nextInt();
		System.out.println("You entered " + p_num + " pennies");
		
		//compute total number of cents
		int total_cents = q_num*q_value + n_num*n_value + d_num*d_value + p_num*p_value;
		//compute total number of cents in dollar form
		int total_dollars = total_cents / 100;
		int remainder_cents = total_cents % 100;
			//if statement to handle grammar.. just makes things look pretty
			if (total_dollars >= 1.0 && total_dollars < 2.0) {
				System.out.println("You have " + total_dollars + " dollar and " + remainder_cents + " cents");
			} else if (total_dollars >= 2.0) {
				System.out.println("You have " + total_dollars + " dollars and " + remainder_cents + " cents");
			} else {
				System.out.println("Sorry! You only have " + total_cents + " cents!");
			}
	}
}
