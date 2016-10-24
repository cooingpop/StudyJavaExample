package g_method;

import java.util.Scanner;

public class Method_2_ {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int intScoreMath[] = new int[3];
		int intScoreEnglish[] = new int[3];
		int Sum=0;
		double Average;
		System.out.println("수학점수 입력");
		for(int i=0;i<intScoreMath.length;i++){
			intScoreMath[i] = scan.nextInt();
		}
		System.out.println("영어점수 입력");
		for(int i=0;i<intScoreEnglish.length;i++){
			intScoreEnglish[i] = scan.nextInt();
		}
		for(int i=0;i<intScoreMath.length;i++){
			Sum +=intScoreMath[i];
		}
		Average = Sum/intScoreMath.length;
		System.out.println("intScoreMath 합계 : "+Sum);
		System.out.println("intScoreMath 평균 : "+Average);

		for(int i=0;i<intScoreEnglish.length;i++){
			Sum +=intScoreEnglish[i];
		}
		Average = Sum/intScoreEnglish.length;
		System.out.println("intScoreMath 합계 : "+Sum);
		System.out.println("intScoreMath 평균 : "+Average);
		scan.close();
	}
	public static void Sum(){

	}
	public static void Average(){

	}
}


