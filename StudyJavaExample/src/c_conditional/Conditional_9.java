package c_conditional;
import java.util.Scanner;

public class Conditional_9 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String str1;
		char ch1;
		System.out.println("a / b / o 중에서 입력해주세요.");
		str1 = scan.next();
		ch1 = str1.charAt(0);
		switch (ch1) {
			case 'a':
				System.out.println("Apple");
				break;
			case 'b':
				System.out.println("Banana");
				break;
			case 'c':
				System.out.println("Orange");
			default:
				System.out.println("잘못 입력하셨습니다");
		}
		scan.close();
	}
}


