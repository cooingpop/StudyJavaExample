package r_practice_ans;

import java.util.Scanner;

public class Ex_8_1_Array_2_ans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 연습문제_배열_2)
		 *
		 * 정수 5개를 배열로 입력 받아 최댓값, 최솟값 구하기
		 */
		Scanner scan = new Scanner(System.in);
		int[] intArr = new int[5];
		int Max = Integer.MIN_VALUE;	// 정수형 중 가장 작은 데이터로 초기화
		int Min = Integer.MAX_VALUE;	// 정수형 중 가장 큰 데이터로 초기화

		for(int i=0;i<intArr.length;i++){
			System.out.print((i+1)+" 번째 숫자를 입력해주세요 : ");
			intArr[i] = scan.nextInt();
		}

		for(int i=0;i<intArr.length;i++){
			//최댓값
			if(intArr[i]>=Max){
				Max = intArr[i];
			}
			//최솟값
			if(intArr[i]<=Min){
				Min = intArr[i];
			}
		}

		System.out.println("최댓값 : " + Max);
		System.out.println("최솟값 : " + Min);
		scan.close();

	}
}
