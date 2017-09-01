/* CS 1301/9
 * Fall 2017   
 * Name: Aidan Murphy	
 * Instructor: Monisha Verma
 * Assignment: Lab 2
*/
package Lab_2;
import java.util.Scanner;
public class Lab_2_5 {

	public static void main(String[] args) {
		//store and receive input from users
		double conversionFactor = 4184;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the weight of the water in kg");
		double waterWeight = s.nextDouble();
		System.out.println("Enter the initial temperature");
		double iTemp = s.nextDouble();
		System.out.println("Enter the final temperatre");
		double fTemp = s.nextDouble();
		
		//compute energy needed
		double energyNeeded = waterWeight * (fTemp - iTemp) * conversionFactor;
		System.out.println("The energy needed is " + energyNeeded + " joules");
	}

}
