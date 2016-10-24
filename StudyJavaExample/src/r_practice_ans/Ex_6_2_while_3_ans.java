package r_practice_ans;

public class Ex_6_2_while_3_ans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 연습문제 while_3)
		 *
		 * 1 ~ 100 까지의 합을 출력
		 *
		 */
		int Sum = 0, iNum=1;
		while(iNum<=100){
			Sum +=iNum++;
		}
		System.out.println("1 ~ 100 까지의 합 : " + Sum);
	}

}
