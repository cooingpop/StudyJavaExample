package g_method;

public class Method_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean bIsTrueOrFalse;
		int intNum;
		int i=5, j=10, sum=0;
		
		bIsTrueOrFalse = ReturnBoolean();
		intNum = ReturnInt();
		sum = ReturnPlus(i,j);
		
		System.out.println("bIsTrueOrFalse = " + bIsTrueOrFalse);
		System.out.println("intNum = " + intNum);
		System.out.println("sum = " + sum);
	}

	public static boolean ReturnBoolean(){
		return true;
	}
	
	public static int ReturnInt(){
		return 10;
	}
	
	public static int ReturnPlus(int a, int b){
		return a+b;
	}
}
