package reflectionTest;

public class BankAccount {
	private final String id;
	private int balance =0;
	
	public BankAccount(String id) {
		this.id=id;
	}
	
	public BankAccount(String id, int balance) {
		this.id=id;
		this.balance=balance;
	}
	public String getId() {
		return this.id;
	}
	public synchronized int getBalance() {
		return this.balance;
	}
	public synchronized void deposit(int amount) {
		balance+=amount;
	}
	public synchronized void withdrawal(int amount) {
		balance-=amount;
	}

}
