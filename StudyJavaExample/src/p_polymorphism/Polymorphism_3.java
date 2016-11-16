package p_polymorphism;

class Over2{
	void hello(){
		System.out.print("Fun! ");
	}
}
public class Polymorphism_3 extends Over2{

	void hello(String a){			
		System.out.println(a);	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymorphism_3 ob = new Polymorphism_3();
		ob.hello();
		ob.hello("Java");
	}
}



