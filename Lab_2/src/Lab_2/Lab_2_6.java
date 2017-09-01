/* CS 1301/9
 * Fall 2017   
 * Name: Aidan Murphy	
 * Instructor: Monisha Verma
 * Assignment: Lab 2
*/
package Lab_2;

import java.util.Scanner;

//(x2 - x1)^2 + (y2-y1)^2 square route of all of that
public class Lab_2_6 {

	public static void main(String[] args) {
		//declare scanners and variables
		Scanner xp1 = new Scanner(System.in);
		Scanner yp1 = new Scanner(System.in);
		Scanner xp2 = new Scanner(System.in);
		Scanner yp2 = new Scanner(System.in);
		Scanner xp3 = new Scanner(System.in);
		Scanner yp3 = new Scanner(System.in);
		System.out.println("Please enter three points of a triangle (x1 y1 x2 y2 x3 y3)");
		double x1 = xp1.nextDouble();
		double y1 = yp1.nextDouble();
		double x2 = xp2.nextDouble();
		double y2 = yp2.nextDouble();
		double x3 = xp3.nextDouble();
		double y3 = yp3.nextDouble();

		//compute side lengths and display them to user
		double side1 = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
		System.out.println("Side 1 equals " + side1);
		double side2 = Math.sqrt(Math.pow(x3-x1, 2) + Math.pow(y3-y1, 2));
		System.out.println("Side 2 equals " + side2);
		double side3 = Math.sqrt(Math.pow(x3-x2, 2) + Math.pow(y3-y2, 2));
		System.out.println("Side 3 equals " + side3);
		double s = (side1 + side2 + side3)/2;
		System.out.println("s equals " + s);
		//computing area
		double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		//print area to user
		System.out.println("The area of the triangle is " + area);
	}

}
