package r_practice_ans;

import java.util.Scanner;

public class Ex_6_1_switch_1_ans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 *  switch_1) 성적출력
		 *  100점 만점인 컴퓨터 시험 성적을 출력하는 프로그램을 만들어보세요.
		 *  90이상 ~ 100이하 A
		 *  80이상 ~ 90미만 B
		 *  70이상 ~ 80미만 C
		 *  70점 미만 D
		 */

		Scanner scan = new Scanner(System.in);
		int intNum = 0;

		System.out.println("컴퓨터 시험 성적을 입력해주세요 : ");
		intNum = scan.nextInt();

		switch (intNum / 10) {
			case 10:
			case 9:
				System.out.println("A");
				break;
			case 8:
				System.out.println("B");
				break;
			case 7:
				System.out.println("C");
				break;
			default:
				System.out.println("D");
				break;
		}

		scan.close();
	}
}
