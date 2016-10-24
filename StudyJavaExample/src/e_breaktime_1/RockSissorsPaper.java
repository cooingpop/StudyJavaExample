package e_breaktime_1;

import java.util.Random;
import java.util.Scanner;

public class RockSissorsPaper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean play=true;
		int com; 		// 컴퓨터 난수
		int you; 		// 사용자 입력
		int cnt=0; 		// 플레이 횟수
		int win=0; 		// 이긴 횟수
		double winper=0; // 승률
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		while(play){
			System.out.println();
			System.out.println("가위(0) 바위(1) 보(2) 종료(3)");
			you = scan.nextInt();
			com = ran.nextInt(3); // 컴퓨터 난수 생성
			if(you==3){ // 위에서 3을 입력했을 경우
				play = false;	// play 가 false 가 되어 while 문을 빠져나가게 됨
				System.out.println("프로그램을 종료합니다.");
			}
			else if(you==0){
				cnt++;		// play 횟수를 증가
				if(you==0){
					System.out.println("Com : 가위 vs You : 가위");
					System.out.println("비겼습니다.");
				}
				else if(com==1){
					System.out.println("Com : 바위 vs You : 가위");
					System.out.println("컴퓨터가 이겼습니다.");
				}
				else{
					System.out.println("Com : 보 vs You : 가위");
					System.out.println("당신이 이겼습니다.");
					win++; // 이긴 횟수 증가
				}

			}
			else if(you==1){
				cnt++; // 총 플레이 횟수 증가
				if(com==0){
					System.out.println("Com : 가위 vs You : 바위");
					System.out.println("당신이 이겼습니다.");
					win++; // 이긴 횟수 증가
				}
				else if(com==1){
					System.out.println("Com : 바위 vs You : 바위");
					System.out.println("비겼습니다.");
				}
				else{
					System.out.println("Com : 보 vs You : 바위");
					System.out.println("컴퓨터가 이겼습니다.");
				}
			}
			else if(you==2){
				cnt++; // 총 플레이 횟수 증가
				if(com==0){
					System.out.println("Com : 가위 vs You : 보");
					System.out.println("컴퓨터가 이겼습니다.");
				}
				else if(com==1){
					System.out.println("Com : 바위 vs You : 보");
					System.out.println("당신이 이겼습니다.");
					win++; // 이긴 횟수 증가
				}
				else{
					System.out.println("Com : 보 vs You : 보");
					System.out.println("비겼습니다.");
				}

			}
			else
				System.out.println("잘 못 입력하셨습니다.");
		} // while end

		scan.close();

		if(cnt!=0)
			winper = (win / (double)cnt)*100;

		System.out.println("==============결과==============");
		System.out.println("플레이 횟수 : " +cnt);
		System.out.println("이긴 횟수 : "+win);
		System.out.printf("승 률   : %.2f %c ",winper,'%');
		// printf는 f 가 format 이라는 함수인데 %d(숫자출력), %f(소숫점 출력),%c 와 같은 함수 포맷 출력 옵션을 사용하기 위해 printf()라는 함수를 사용합니다.
		// 여기에서 %.2f 는 소숫점 2자리 까지 표현하는 방법입니다.
		// %c 는 문자 출력을 위한 표현 방법입니다.
	}
}
