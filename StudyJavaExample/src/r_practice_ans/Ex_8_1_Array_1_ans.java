package r_practice_ans;

import java.util.Scanner;

public class Ex_8_1_Array_1_ans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 연습문제_배열_1)
		 *
		 * 정수 5개를 배열로 입력 받아 합과 평균을 구하세요
		 */

		Scanner scan = new Scanner(System.in);
		int[] intArr = new int[5];
		int Sum=0;
		double Average=0.0;

		for(int i=0;i<5;i++){
			System.out.print((i+1)+"번째 정수 를 입력해주세요 : ");
			intArr[i] = scan.nextInt();
		}

		for(int i=0;i<intArr.length;i++){
			Sum += intArr[i];
		}
		Average = Sum/intArr.length;
		System.out.println("총 합 : " + Sum);
		System.out.println("평 균 : " + Average);

		scan.close();
	}
}

