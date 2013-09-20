
import java.util.*;

class ATM {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try {
			double withdrawal = s.nextDouble();
			double balance = s.nextDouble();
			s.close();
			balance = performWithdrawal(withdrawal, balance);
			System.out.println(balance);
		} catch(Exception e) {}
		System.exit(0);
	}
	
	public static double performWithdrawal(double withdrawal, double balance) {
		if (withdrawal % 5 == 0 &&
			withdrawal > 0) 
		{
			withdrawal += .5;    
			if (balance >= withdrawal) {
				balance -= withdrawal;
			}
		}
		return balance;
	}
}
