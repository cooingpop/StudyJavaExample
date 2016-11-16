package k_constructor;

class Inherit{
	int a;
	Inherit(){
		a=1;
	}
	Inherit(int num){
		this.a = num;
	}
}

public class Constructor_1 extends Inherit{
	int b;
	Constructor_1(int a, int b){
		super(a);
		this.b = b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Constructor_1 ob = new Constructor_1(10,20);
		System.out.println(ob.a + " " + ob.b);
	}
}
