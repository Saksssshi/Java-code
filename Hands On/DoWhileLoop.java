/*
 Program to Demonstarte do-while and print reverse counting
 Name: Sakshi Gupta
 Date: 12.10.2022
*/
package loops;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Which Number do you want to put: ");
		int num = sc.nextInt();
		sc.close();
		//test Expression
		for(int i = num; i>=1; i--)
		
		do
		{
			System.out.println(i);
			
		}
		
		
		while(num <= 0);
		{
			num++;
		}
	}

}
