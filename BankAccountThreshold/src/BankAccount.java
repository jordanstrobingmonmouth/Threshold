
public class BankAccount {
	 private double balance;
	   
	   private double interestPct;

	   /**
	      Constructs a bank account with zero balance.
	   */
	   public BankAccount(double amount, double intpct)
	   {
	      balance = amount;
	      interestPct = intpct;
	   }

	   /**
	      Makes a deposit into this account.
	      @param amount the amount of the deposit
	   */
	   public void deposit(double amount)
	   {
	      balance = balance + amount;
	   }

	   /**
	      Makes a withdrawal from this account, or charges a penalty if
	      sufficient funds are not available.
	      @param amount the amount of the withdrawal
	   */
	   public void withdraw(double amount)
	   { 
		   if ((balance - amount) >= 0) {
			   balance = balance - amount;
			 } else {
				 System.out.println("Insufficient Funds to support withdrawal");
			 }
	   
	   }
	   /**
	      Gets the current balance of this bank account.
	      @return the current balance
	   */
	   public void calcInterest() {
		   
		   balance = balance + (balance * interestPct);
		   
	   }
	   
	   public double getIntPct() {
		   return interestPct;
	   }
	   
	   public double getBalance()
	   {
	      return balance;
	   }

}
