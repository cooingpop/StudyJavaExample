package e_breaktime_1;

import java.util.Random;
import java.util.Scanner;

public class UpandDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int num; // 난수 입력할 변수
		int start, end; // 숫자의 범위
		int life; // 기회
		int user; // 사용자가 입력한 수
		boolean play = true, game = true;
		while (play) {
			System.out.println("범위를 설정 해 주세요. 종료(Ctrl + c)");
			System.out.print("시작 숫자를 입력해주세요 : ");
			System.out.println();
			start = scan.nextInt();
			System.out.print("끝 숫자를 입력해주세요 : ");
			end = scan.nextInt();
			life = 10; // 기회 초기화
			num = ran.nextInt(end) + start; // 난수 생성
			System.out.println("============================================");
			System.out.println("숫자를 맞춰보세요.(" + start + "~" + end + ") 기회는 " + life + "번 입니다.");
			while (game) {
				user = scan.nextInt(); // 사용자로부터 수를 입력받음.

				if (user == num) {
					System.out.println("정답입니다.!!!!");
					game = false;
				} else if (user > num) {
					System.out.println("Down!!!");
					life--;
					System.out.println("남은 기회는" + life + "번 입니다.");
				} else if (user < num) {
					System.out.println("Up!!!");
					life--;
					System.out.println("남은 기회는" + life + "번 입니다.");
				}
				if (life < 1) {
					game = false; // 기회를 모두 소진시 while문을 빠져나감
					System.out.println("정답은 " + num + " 입니다.");
					System.out.println("!!!!!!!! GAME OVER !!!!!!!!");
				}
			} // while end
			game = true;
		} // while end
		scan.close();
	}
}