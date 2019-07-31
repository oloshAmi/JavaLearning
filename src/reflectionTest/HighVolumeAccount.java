package reflectionTest;

public final class HighVolumeAccount extends BankAccount implements Runnable{
	public HighVolumeAccount(String id) {
		super(id);
	}
	
	public HighVolumeAccount(String id, int balance) {
		super(id,balance);
	}
	
	private int[] readDailyDeposits(){
		return new int[] {10,20,30,40,50,60,71,80,90,91};
	}
	private int[] readDailyWithdrawals(){
		return new int[] {10,20,30,40,50,60,71,80,90,91};
	}
	
	public void run() {
		for (int depositAmt:readDailyDeposits())
			deposit(depositAmt);
		for (int withdrawalAmt:readDailyWithdrawals())
			deposit(withdrawalAmt);
	}
 
}
