package l_encapsulation;

class Bank2{
	private int Account;

	public int getAccount() {
		return Account;
	}

	private void setAccount(int account) {
		Account = account;
	}

	public void Deposit(int money){
		int Current = getAccount();
		Current += money;
		setAccount(Current);
	}

	public void Withdraw(int money){
		int Current = getAccount();
		Current -= money;
		setAccount(Current);
	}
}

public class Encapsulation_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank2 bank2 = new Bank2();
		bank2.Deposit(1000);
		//bank2.Account = 100000;
		//bank2.setAccount(100000);
		System.out.println("현재 예금 : " + bank2.getAccount());
	}

}



