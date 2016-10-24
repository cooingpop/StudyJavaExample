package g_method;

public class Method_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArr = new int[5];
		int[] intArr2 = new int[5];

		System.out.println("[main 메서드]");
		System.out.println("intArr 주소 : " +intArr);
		System.out.println("intArr2 주소 : " +intArr2);
		System.out.println("");
		CallByReference(intArr);
		intArr2 = intArr;
		System.out.println("");
		System.out.println("[main 메서드]");
		System.out.println("intArr2 = intArr;");
		System.out.println("intArr2 주소 : " +intArr2);

	}

	public static void CallByReference(int[] intArr){
		System.out.println("[CallByReference 메서드]");
		System.out.println("intArr 주소 : " + intArr);
	}
}

