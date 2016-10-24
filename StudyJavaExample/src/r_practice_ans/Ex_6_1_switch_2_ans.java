package r_practice_ans;

import java.util.Scanner;

public class Ex_6_1_switch_2_ans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * switch_2) 사칙연산이 가능한 계산기 만들기
		 */
		Scanner scan = new Scanner(System.in);
		int intNum = 0, intNum2=0;
		char Operator;

		System.out.print("정수 입력: ");
		intNum = scan.nextInt();
		System.out.print("연산( +, -, *, /) : ");
		Operator = scan.next().charAt(0);
		System.out.print("정수 입력: ");
		intNum2 = scan.nextInt();

		switch (Operator) {
			case '+':
				System.out.println(intNum + " + " + intNum2 + " = " + (intNum + intNum2));
				break;
			case '-':
				System.out.println(intNum + " - " + intNum2 + " = " + (intNum - intNum2));
				break;
			case '*':
				System.out.println(intNum + " * " + intNum2 + " = " + (intNum * intNum2));
				break;
			case '/':
				if (intNum != 0)
					System.out.println(intNum + " / " + intNum2 + " = " + (intNum / intNum2));
				else
					System.out.println("0으로 나눌 수 없습니다");
				break;
			default:
				System.out.println("연산자를 잘못 입력하였습니다.");
		}
		scan.close();
	}
}




