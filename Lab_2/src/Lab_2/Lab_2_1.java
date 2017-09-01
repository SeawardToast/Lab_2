/* CS 1301/9
 * Fall 2017   
 * Name: Aidan Murphy	
 * Instructor: Monisha Verma
 * Assignment: Lab 2
*/
package Lab_2;
import java.util.Scanner;
public class Lab_2_1 {
	
	public static void main(String[] args) {
		//declarations
		int x, y, z;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter values x, y , z");
		x = s.nextInt();
		y = s.nextInt();
		z = s.nextInt();
		//compute average
		int average = (x + y + z) / 3;
		//print to console
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);
		System.out.println("The average of these three integers is " + average);
	}
}
