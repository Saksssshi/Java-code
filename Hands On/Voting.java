/* Test whether the person is eligible to give vote using (if-else)
 	Name: Sakshi Gupta
 	Date: 11.10.21
 */

package vote;
import java.util.Scanner;
public class Voting {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Age: ");
		int age = sc.nextInt();
		
		sc.close();
		
		if (age < 18)
		{
			
			System.out.println("You can't Vote");
		}
		
		else
		{
			
			System.out.println("You can vote");
		}
	}

}
