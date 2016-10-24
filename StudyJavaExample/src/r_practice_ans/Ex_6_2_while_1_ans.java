package r_practice_ans;

public class Ex_6_2_while_1_ans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 연습문제 while_1)
		 *
		 * 1 ~ 100까지 정수 중 2의 배수 출력
		 * 
		 */
		int iNum = 1;
		while(iNum<=100){

			if(iNum%2==0){
				System.out.println(iNum);
			}
			iNum++;
		}
	}

}

