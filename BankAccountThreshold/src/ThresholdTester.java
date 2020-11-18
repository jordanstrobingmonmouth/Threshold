import java.util.Scanner;
public class ThresholdTester {
	
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter initial balance: ");
		int bal = in.nextInt();
		System.out.println("Enter interest percentage: (ex .05) ");
		double intPct = in.nextDouble();
		
		BankAccount myBankAccount = new BankAccount(bal, intPct);
		
		
		System.out.println("Enter a threshold: ");
		while (in.hasNextDouble()) {
			int numMonths = 0;
			double threshold = in.nextDouble();
			while (myBankAccount.getBalance() < threshold) {
				myBankAccount.getBalance();
				myBankAccount.calcInterest();
				numMonths++;
			}
			System.out.println("The number of months it takes to hit the threshold is " + numMonths);
			System.out.println("Enter another threshold or enter 'End' to stop: ");
		}
		
		
	}
	

}