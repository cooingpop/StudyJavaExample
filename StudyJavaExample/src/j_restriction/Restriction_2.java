package j_restriction;

class Bank{
	static int money = 0;
	void printMoney(int in, int out){
		money = money + in - out;
		if(money<0){
			System.out.println((-1*money)+"원 부족합니다.");
		}else{
			System.out.println("잔금은 " + money + "원 입니다.");
		}
	}
}
public class Restriction_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank bk1 = new Bank();
		Bank bk2 = new Bank();
		bk1.printMoney(1000, 100);
		bk2.printMoney(0, 250);
		bk1.printMoney(0, 800);
	}
}


