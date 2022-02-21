package JavaSDETSession;

public class Account {
private long accountNumber;
private String accoutHolder;
private double balance;
private String accountType;
public Account(long accountNumber, String accoutHolder, double balance,String accountType) {
	super();
	this.accountNumber = accountNumber;
	this.accoutHolder = accoutHolder;
	this.balance = balance;
	this.accountType=accountType;
	
}
@Override
public String toString() {
	return "Account [accountNumber=" + accountNumber + ", accoutHolder=" + accoutHolder + ", balance=" + balance +", accountType"+accountType +"]";
}
public long getAccountNumber() {
	return accountNumber;
}

/*
 * public void setAccountNumber(long accountNumber) { this.accountNumber =
 * accountNumber; }
 */
public String getAccoutHolder() {
	return accoutHolder;
}
public void setAccoutHolder(String accoutHolder) {
	this.accoutHolder = accoutHolder;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public String getAccountType() {
	return accountType;
}
/*
 * public void setAccountType(String accountType) { this.accountType =
 * accountType; }
 */

}
