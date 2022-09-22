package inheritance;

public class Bank_main {
	
	public static void main (String[] args)
	{
		Bank b1 = new Bank();
		
		b1.BankDetails();
		b1.employee();
		
		KotakBank k1 = new KotakBank();
		
		k1.BankDetails();
	
		Bankofbaroda b2 = new Bankofbaroda();
		
		b2.BankDetails();
	}
}
