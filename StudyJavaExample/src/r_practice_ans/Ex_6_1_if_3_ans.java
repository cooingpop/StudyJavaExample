package r_practice_ans;

import java.util.Scanner;

public class Ex_6_1_if_3_ans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 *  if_3)
		 *  100점 만점인 컴퓨터 시험 성적을 출력하는 프로그램을 만들어보세요.
		 *  90이상 ~ 100이하 A
		 *  80이상 ~ 90미만 B
		 *  70이상 ~ 80미만 C
		 *  70점 미만 D
		 */

		Scanner scan = new Scanner(System.in);
		int intNum=0;
		System.out.print("점수를 입력해주세요 :");
		intNum = scan.nextInt();

		if(intNum>=90){
			System.out.println("A");
		}
		else if(intNum<90 && intNum>=80){
			System.out.println("B");
		}
		else if(intNum<80 && intNum>=70){
			System.out.println("C");
		}
		else if(intNum<70){
			System.out.println("D");
		}
		scan.close();
	}
}

