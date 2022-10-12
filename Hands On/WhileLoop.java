/*
 Program to Demonstarte while loop countinues until entered number is positive
 Name: Sakshi Gupta
 Date: 12.10.2022
 */
package loops;
 

import java.util.Scanner;

public class WhileLoop2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Which number you want to put: ");
		int num = sc.nextInt();
		sc.close();
		//test Expression
		while(num < 0);
		{
			System.out.println("Welcome to My World");
			num++;
			//break;
		}
		
	}

}
