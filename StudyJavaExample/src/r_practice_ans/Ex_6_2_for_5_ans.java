package r_practice_ans;

public class Ex_6_2_for_5_ans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 연습문제 for_5) 도형 출력(2)
		 * 
		 * 		*
		 * 		**
		 * 		***
		 * 		****
		 */

		for(int i=0;i<4;i++){
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
