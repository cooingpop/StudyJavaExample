package r_practice_ans;

import java.util.Scanner;

public class Ex_6_2_for_3_ans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 연습문제 for_3) 수를 입력받아서 그 수의 단을 출력(구구단)
		 *
		 * 출력할 구구단 수를 입력해주세요 : 5
		 * 	5 x 1 = 5
		 *	5 x 2 = 10
		 *	5 x 3 = 15
		 *	5 x 4 = 20
		 *	5 x 5 = 25
		 *	5 x 6 = 30
		 *	5 x 7 = 35
		 *	5 x 8 = 40
		 *	5 x 9 = 45
		 */
		Scanner scan = new Scanner(System.in);
		int iNum=0;
		System.out.print("출력할 구구단 수를 입력해주세요 : ");
		iNum = scan.nextInt();

		for(int i=1;i<=9;i++)
		{
			System.out.println(iNum + " x " + i + " = " + iNum*i);
		}
		scan.close();
	}
}
