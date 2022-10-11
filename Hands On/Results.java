/*
 demonstrate if-else statement of 5 subjects.the person who gets above 60% will be 
 passed otherwise failed.output should be like:Enter your name,Enter marks for the 5 
 subjects.
 
 Name: Sakshi Gupta
 Date: 11.10.21
 */

package examresults;
import java.util.Scanner;
public class Results {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name: ");
		String Name = sc.nextLine();
		
		System.out.println("Enter your total Marks: ");
		double Mark = sc.nextInt();
		
		sc.close();
		double TotalMarks = 500;
		
		double Percentage = Mark/TotalMarks*100;
		
		if (Mark<300)
		{
			System.out.println("Failed");			
		}
	
		else
		{
			System.out.println("Passed");
		}
		
	}

}
