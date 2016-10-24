package g_method;

public class Method_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] intArr = new int[5];
		CallByReference(intArr);
		Print(intArr);
	}
	public static void CallByReference(int[] intArr){
		for(int i=0;i<intArr.length;i++){
			intArr[i] = i;
		}
	}
	
	public static void Print(int[] intArr){
		for(int i=0;i<intArr.length;i++){
			System.out.println(intArr[i]); 
		}
	}
}
