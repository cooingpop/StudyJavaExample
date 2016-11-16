package m_inheritance;

class Parent2{
	int a;
	Parent2(){
		a = 10;
		System.out.println("부모 생성자 호출");
	}
}
public class Inherit_2 extends Parent2{
	
	int b;
	Inherit_2(){
		// super(); <- 숨어 있다.
		b = 20;
		System.out.println("자식 생성자 호출");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inherit_2 ob = new Inherit_2();
		System.out.println("a의 값 : " + ob.a);
		System.out.println("b의 값 : " + ob.b);
	}
}

