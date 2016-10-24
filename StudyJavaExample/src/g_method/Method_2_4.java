package g_method;

import java.util.Scanner;

public class Method_2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int intScoreMath[] = new int[3];
		int intScoreEnglish[] = new int[3];
		int Sum=0;
		double Average=0.0;
		System.out.println("수학점수 입력");
		for(int i=0;i<intScoreMath.length;i++){
			intScoreMath[i] = scan.nextInt();
		}
		System.out.println("영어점수 입력");
		for(int i=0;i<intScoreEnglish.length;i++){
			intScoreEnglish[i] = scan.nextInt();
		}
		Sum = Sum(intScoreMath);
		Average = Average(Sum,intScoreMath.length);
		Print("intScoreMath",Sum,Average);

		Sum = Sum(intScoreEnglish);
		Average = Average(Sum,intScoreEnglish.length);
		Print("intScoreEnglish",Sum,Average);
		scan.close();
	}
	public static void Print(String strName,int Sum, double Average){
		System.out.println(strName + " 합계 : "+Sum);
		System.out.println(strName + " 평균 : "+Average);
	}
	public static int Sum(int[] Score){
		int Sum = 0;
		for(int i=0;i<Score.length;i++){
			Sum +=Score[i];
		}
		return Sum;
	}
	public static double Average(int Sum,int cnt){
		return Sum/cnt;
	}
}
