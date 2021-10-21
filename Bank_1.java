package miniproject;

public class Bank_1 
{
	private int accountNumber;
	private String accountHolderName,typeOfAccount;
	private double balance;
	public Bank_1(int accountNumber , String accountHolderName , String typeOfAccount, double balance)
	{
		this.accountNumber=accountNumber;
		this.accountHolderName=accountHolderName;
		this.typeOfAccount=typeOfAccount;
		this.balance=balance;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public String getTypeOfAccount() {
		return typeOfAccount;
	}
	public void setTypeOfAccount(String typeOfAccount) {
		this.typeOfAccount = typeOfAccount;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Bank_1 [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName
				+ ", typeOfAccount=" + typeOfAccount + ", balance=" + balance + "]";
	}
	
	

}
