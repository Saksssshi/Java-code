	/*
	Create a program for calculation.read three values from the user for operation
	first and second values as operands. third value as operator.
	if user press1 => print addition of first and second
	if user press2 => print subtraction of first and second
	if user press3 => print multiplication of first and second
	if user press4 => print division of first and second

	Name : Sakshi Gupta
	Date : 06-10-22
	*/

	package Calculate;
	import java.util.Scanner;
	class calculating
	{
	public static void main(String args[])
	{
		
	// Assigning a Integer
	int m, n, o;
	int addition;
	int substraction;
	int multiplication;
	int division;

	// creating a Scanner for user input
	Scanner sc = new Scanner(System.in);

	// taking a value from a 1st User
	System.out.println("Enter your First Number : ");
	m= sc.nextInt();

	// taking a value from a 2nd User
	System.out.println("Enter your Second Number :");
	n= sc.nextInt();

	// Options for choosing Solution Method for User
	System.out.println("Click 1 = For the adding Numbers");
	System.out.println("Click 2 = For the Subtracting Numbers");
	System.out.println("Click 3 = For the Multiplying Numbers");
	System.out.println("Click 4 = For the Dividing Numbers");
	o= sc.nextInt();

	// using if else 
	if(o==1)
	{
		addition= m+n;
	System.out.println("Adding the variable m and n \n" +addition);
	}
	else if(o==2)
	{
		substraction=m-n;
	System.out.println("Substracting the variable m and n \n" +substraction);
	}
	else if(o==3)
	{
	multiplication= m*n;
	System.out.println("Multiplying the variable m and n \n" +multiplication);
	}

	else if(o==4)
	{
	division= m/n;
	System.out.println("Divide the variable m and n \n" + division);
	}

	else 
	{
	System.out.println("ReEnter your Value");
	}
	}
	}
