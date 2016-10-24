package f_array;

public class Array_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 배열 선언
		 * intArr 이라는 이름을 가진 배열 생성
		 * 크기는 5 , 타입은 int
		 */
		int intArr[];
		intArr = new int[5];

		for(int i=0;i<5;i++){
			intArr[i] = i;
			System.out.println("intARR["+i+"]="+intArr[i]);
		}

		for(int i=0;i<intArr.length;i++){
			intArr[i] = i;
			System.out.println("intARR["+i+"]="+intArr[i]);
		}

	}
}

