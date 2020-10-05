/**
 * 
 */
package uk.ac.qub.week2;

import java.util.Scanner;
/**
 * @author geraldcraig
 *
 */
public class Practical3c {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int age;
		age = 0;
		String name;
		name = "";
		
		System.out.println("Please input your age");
		age = scanner.nextInt();
		
		if (age >= 17) {
			System.out.println("Please enter your name");
		}
		name = scanner.next();
		
		System.out.println(age + name);
		
		scanner.close();
	}

}
