package l_encapsulation;

class Bank{
	public int Account;

	public void Deposit(int money){
		Account +=money;
	}

	public void Withdraw(int money){
		Account -=money;
	}
}

public class Encapsulation_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank = new Bank();
		bank.Withdraw(1000);
		bank.Account = 50000;

		System.out.println("현재 예금 : " + bank.Account);
	}

}
