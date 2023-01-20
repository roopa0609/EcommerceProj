[1:22 pm, 18/08/2022] Anil Kukat MSc: public class SBIBank {
	
	int balance=100000;
	int accountNo;
	int depositAmount;
	int withDraw;
	int transferToAccount;
	int transferAmount;
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public int getDepositAmount() {
		return depositAmount;
	}
	public void setDepositAmount(int depositAmount) {
		this.depositAmount = depositAmount;
	}
	public int getWithDraw() {
		return withDraw;
	}
	public void setWithDraw(int withDraw) {
		this.withDraw = withDraw;
		balance = balance-this.withDraw;
	}
	public int getTransferToAccount() {
		return transferToAccount;
	}
	public void setTransferToAccount(int transferToAccount) {
		this.transferToAccount = transferToAccount;
	}
	
	public void transferAmount(int transferAmount) {
		balance=balance- transferAmount;
	}
	
}
[1:22 pm, 18/08/2022] Anil Kukat MSc: public class AnilSBAccount {

	public static void main(String[] args) {
		int balance ;
		SBIBank anilAccount = new SBIBank();
		anilAccount.transferAmount(30000);
		
		balance= anilAccount.getBalance();
		System.out.println("Anil Balance = "+balance);
		
		anilAccount.setWithDraw(5000);
		balance= anilAccount.getBalance();
		System.out.println("Anil Balance = "+balance);

	}

}