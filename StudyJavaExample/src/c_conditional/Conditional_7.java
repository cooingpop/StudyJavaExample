package c_conditional;
import java.util.Scanner;

public class Conditional_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int iSelected = 0;
		System.out.println("1.학생  2.직장인 3.취준생");
		iSelected = scan.nextInt();

		switch (iSelected) {
			case 1:
				System.out.println("학생을 선택하였습니다.");
				break;
			case 2:
				System.out.println("직장인을 선택하였습니다.");
				break;
			case 3:
				System.out.println("취준생을 선택하였습니다.");
				break;
			default:
				System.out.println("잘못 입력하였습니다.");

		}
		scan.close();
	}
}




