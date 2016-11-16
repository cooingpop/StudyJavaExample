package p_polymorphism;

class Over1{
	void hello(){
		System.out.print("Fun! ");
	}
}
public class Polymorphism_2 extends Over1{

	void hello(){			// 오버라이드
		super.hello();				// 상속 받은 hello() 호출
		System.out.println("Java");	// 기능 확장
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymorphism_2 ob = new Polymorphism_2();
		ob.hello();
	}
}
