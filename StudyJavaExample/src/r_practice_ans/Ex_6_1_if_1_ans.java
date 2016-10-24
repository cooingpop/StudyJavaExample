package r_practice_ans;
import java.util.Scanner;

public class Ex_6_1_if_1_ans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * if_1) 두 수 비교
		 * 정수 두 개를 Scanner로 입력 받아
		 * 같은 숫자이면 "같습니다."
		 * 다른 숫자이면 "다릅니다." 라고 출력해보세요.
		 */
		Scanner scan = new Scanner(System.in);
		int intNum = 0;
		int intNum2 = 0;

		System.out.println("첫 번째 숫자를 입력해주세요 : ");
		intNum = scan.nextInt();
		System.out.println("두 번째 숫자를 입력해주세요 : ");
		intNum2 = scan.nextInt();

		if(intNum==intNum2)
		{
			System.out.println("같습니다");
		}
		else
		{
			System.out.println("다릅니다");
		}

		scan.close();
	}
}




