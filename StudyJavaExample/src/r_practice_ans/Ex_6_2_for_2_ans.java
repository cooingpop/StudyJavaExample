package r_practice_ans;

public class Ex_6_2_for_2_ans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 연습문제 for_2) 구구단 중에서 4단을 출력
		 * 
		 * 
		 * 	4 x 1 = 4	4 x 2 = 8	4 x 3 = 12	
		 *	4 x 4 = 16	4 x 5 = 20	4 x 6 = 24	
		 *	4 x 7 = 28	4 x 8 = 32	4 x 9 = 36
		 *
		 */
		for(int i=1;i<=9;i++){
			System.out.print("4 x " + i + " = " + i*4 + "\t");
			if(i%3==0)
				System.out.println();
		}
	}

}
