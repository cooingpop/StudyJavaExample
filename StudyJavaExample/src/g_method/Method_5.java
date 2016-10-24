package g_method;

public class Method_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int j = 2;
		CallByValue(i,j);
		System.out.println("i : " + i);
		System.out.println("j : " + j);
	}
	public static void CallByValue(int a, int b){
		a += 10;
		b += 10;
		System.out.println("a : " + a);
		System.out.println("b : " + b);
	}
}
	/* 
	 * java에서 인수(매개변수)로 기본 데이터형을 사용하면 모두 Call By Value가 됩니다.
	 * Call By Value는 주어진 값을 복사하여 처리하는 방식입니다.
	 * 함수로 인자를 전달할 때 전달 될 인자(파라미터,매개변수)는 함수의 변수로 복사하며,
	 * 복사된 값은 함수내에서 지역적으로 사용되는 local value(지역 변수, 값)라는 특징을 가집니다.
	 * 따라서 메서드 내의 처리 결과는 메서드 밖에 변수에는 영향을 미치지 않습니다.
	 */


