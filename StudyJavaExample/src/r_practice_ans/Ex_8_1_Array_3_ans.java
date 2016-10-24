package r_practice_ans;

import java.util.Scanner;

public class Ex_8_1_Array_3_ans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 연습문제_배열_3)
		 * 배열로 입력 받은 알파벳을 대문자면 소문자로
		 * 소문자면 대문자로 변환 후  출력
		 */
		Scanner scan = new Scanner(System.in);
		int[] Alphabet = new int[5];

		int ascii_a = 97;
		int ascii_A = 65;
		int ascii_z = 122;
		int ascii_Z = 90;

		for(int i=0;i<Alphabet.length;i++){
			System.out.print((i+1)+"번째 알파벳을 입력해주세요 : ");
			Alphabet[i] = scan.next().charAt(0);
		}

		for(int i=0;i<Alphabet.length;i++){

			if(Alphabet[i]>=ascii_A && Alphabet[i]<=ascii_Z)  //대문자인 경우 +32 하면 소문자로 변환
			{
				Alphabet[i] += 32;
			}
			else if(Alphabet[i]>=ascii_a && Alphabet[i]<=ascii_z)  //소문자인 경우 -32 하면 소문자로 변환
			{
				Alphabet[i] -=32;
			}
			System.out.println(Character.toChars(Alphabet[i]));
			//System.out.println((char)(Alphabet[i]));
		}
		//str.toUpperCase();
		//str의 값을 모두 대문자로 바꾸기

		//str.toLowerCase();
		//str의 값을 모두 소문자로 바꾸기
		scan.close();
	}
}




