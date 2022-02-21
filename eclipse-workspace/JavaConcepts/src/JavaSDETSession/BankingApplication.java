package JavaSDETSession;

public class BankingApplication {
	//create account
	public Account createAccount (long accountNumber, String accoutHolder, double balance,String accountType) {
		Account account = new Account( accountNumber,  accoutHolder,  balance, accountType);
		return account;
		
	}
	//check balance
	public double getAccountBalance (Account account) {
		
		return account.getBalance();
		
	}
	
	//deposit money
	
	public double depositMoney(Account account,double amount) {
		double newBalance = account.getBalance()+ amount;
		return newBalance;
	}
	//withdraw Amount 
	public Account withDrawMoney(Account account,double amount) {
		double newBalance = account.getBalance()- amount;
		account.setBalance(newBalance);
		return account;
	}
	public static void main(String[] args) {
		BankingApplication application=new BankingApplication();
		Account account = application.createAccount(1465, "Deepali", 4000, "Saving");
		double balance = application.getAccountBalance(account);
		System.out.println("balance is "+balance);
		Account account1 = application.withDrawMoney(account, 1000);
		System.out.println("new balance is "+account1.getBalance());

	}
	
	

}
