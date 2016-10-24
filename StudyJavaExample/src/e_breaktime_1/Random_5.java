package e_breaktime_1;

public class Random_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			/*
			 * 대문자 A-Z 랜덤 알파벳 생성
			 */
		for(int i =0;i<10;i++){
			char ch = (char)((Math.random()*26)+65);
			System.out.print(ch + "  ");
		}
		System.out.println(); // 줄바꿈
			/*
			 * 소문자 a-z 랜덤 알파벳 생성
			 */
		for(int i=0;i<10;i++){
			char ch = (char)((Math.random()*26)+97);
			System.out.print(ch+ "  ");
		}
	}
}



