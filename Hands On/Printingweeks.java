/*Program to Demonstrate (Switch) and printing week days
  Name: Sakshi Gupta
  Date: 11.10.22
*/
package printingweeks;

import java.util.Scanner;

public class Printingweeks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Week number: ");
		int Case = sc.nextInt();
		sc.close();
        switch(Case)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            default:
                System.out.println("Weekend");
                break;
        }
    }
	}


