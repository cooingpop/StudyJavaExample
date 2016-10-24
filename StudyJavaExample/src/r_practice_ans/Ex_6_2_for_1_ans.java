package r_practice_ans;

public class Ex_6_2_for_1_ans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 연습문제 for_1) 1 ~ 100 까지 짝수의 합 출력
		 */
		int Sum = 0;
		for(int i=1;i<=100;i++){
			if(i%2==0)
				Sum +=i;
		}
		System.out.println("1 ~ 100 까지 짝수의 합 : " + Sum);
	}

}
