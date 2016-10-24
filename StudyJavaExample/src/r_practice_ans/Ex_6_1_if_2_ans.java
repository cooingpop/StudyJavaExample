package r_practice_ans;

import java.util.Scanner;

public class Ex_6_1_if_2_ans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * if_2) 간단한 사칙연산
		 * 정수 두 개를 Scanner로 입력 받아
		 * 덧셈, 뺄셈, 곱셈, 나눗셈 결과를 출력하세요.
		 */
		Scanner scan = new Scanner(System.in);

		int intNum = 0;
		int intNum2 = 0;
		char Operator;
		System.out.println("첫 번째 숫자를 입력해주세요 : ");
		intNum = scan.nextInt();
		System.out.println("연산을 선택해주세요.( + , - , * , / )" );
		Operator = scan.next().charAt(0);
		System.out.println("두 번째 숫자를 입력해주세요 : ");
		intNum2 = scan.nextInt();

		if(Operator=='+')
		{
			System.out.println(intNum+" + "+intNum2+" = " + (intNum + intNum2));
		}
		else if(Operator=='-')
		{
			System.out.println(intNum+" - "+intNum2+" = " + (intNum - intNum2));
		}
		else if(Operator=='*')
		{
			System.out.println(intNum+" * "+intNum2+" = " + (intNum * intNum2));
		}
		else if(Operator=='/')
		{
			if(intNum2!=0)
			{
				System.out.println(intNum+" / "+intNum2+" = " + (intNum / intNum2));
			}
			else
				System.out.println("0으로는 나눌 수 없습니다.");
		}

		scan.close();
	}

}
