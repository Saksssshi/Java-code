/* 
Q. Create a program to find largest of two numbers.
Name : Sakshi Gupta
Date : 06-10-22
*/

package largestnumber;
import java.util.Scanner;

class largernumber
{
	public static void main(String args[])
{
	//Taking Scanner value for user
	Scanner sc= new Scanner(System.in);

	//taking 1st value from user
	System.out.println("enter 1st Digit");
	int num1 = sc.nextInt();
	
	//taking 2nd value from user
	System.out.println("enter 2nd Digit");
	int num2 = sc.nextInt();
	sc.close();
	// using a conditions
	// Creating if else Statements
	if(num1>num2)
	{
	System.out.print(num1 + " is larger ");
	}
	
	else if(num2>num1)
	{
		System.out.print(num2 + " is larger " + num1);
	}
}
}

