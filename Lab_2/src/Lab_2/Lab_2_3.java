/* CS 1301/9
 * Fall 2017   
 * Name: Aidan Murphy	
 * Instructor: Monisha Verma
 * Assignment: Lab 2
*/

package Lab_2;
import java.util.Scanner;

public class Lab_2_3 {

	public static void main(String[] args) {
		//declarations
		Scanner s = new Scanner(System.in);
		byte byte_value;
		short short_value;
		int int_value;
		long long_value;
		float float_value;
		double double_value;
		boolean bool_value;
		char char_value;
		
		//accept byte input from users
		System.out.println("Enter byte value");
		byte_value = s.nextByte();
		
		//print byte value back to users
		System.out.println("\nThe byte value entered is " + byte_value);
		
		//accept short input from users
		System.out.println("\nEnter short value");
		short_value = s.nextShort();
		
		//print short value back to users
		System.out.println("\nThe short value entered is " + short_value);
		
		//accept int input from users
		System.out.println("\nEnter integer value");
		int_value = s.nextInt();
		
		//print int value back to users
		System.out.println("\nThe integer value entered is " + int_value);
		
		//accept long value from users
		System.out.println("\nEnter long value");
		long_value = s.nextLong();
		
		//print long back to users
		System.out.println("\nThe long value entered is " + long_value);
		
		//accept float value from users
		System.out.println("\nEnter float value");
		float_value = s.nextFloat();
		
		//print float value back to users
		System.out.println("\nThe float value entered is " + float_value);
		
		//accept double value from users
		System.out.println("\nEnter double value");
		double_value = s.nextDouble();
		
		//print double value back to users
		System.out.println("\nThe double value entered is " + double_value);
		
		//accept boolean value from users
		System.out.println("\nEnter boolean value");
		bool_value = s.nextBoolean();
		
		//print boolean value back to users
		System.out.println("\nThe boolean value entered is " + bool_value);
		
		//accept char value from users
		System.out.println("\nEnter char value");
		char_value = s.next().charAt(0);
		
		//print char value back to users
		System.out.println("\nThe char value entered is " + char_value);	
	}

}
