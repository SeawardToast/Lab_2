/* CS 1301/9
 * Fall 2017   
 * Name: Aidan Murphy	
 * Instructor: Monisha Verma
 * Assignment: Lab 2
*/

package Lab_2;
import java.util.Scanner;
public class Lab_2_2 {

	public static void main(String[] args) {
		//declarations
		Scanner s = new Scanner(System.in);
		float r, t;
		System.out.println("Enter two flaot values");
		r = s.nextFloat();
		t = s.nextFloat();
		//compute sum, difference, product
		float sum = r + t;
		float difference = r - t;
		float product = r*t;
		//print out values, sum, difference, product
		System.out.println("r = " + r);
		System.out.println("t = " + t);
		System.out.println("The sum of these two floating-point numbers is " + sum);
		System.out.println("The difference of these two floating-point numbers is " + difference);
		System.out.println("The product of these two floating-point numbers is " + product);

	}

}
