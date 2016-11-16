package m_inheritance;

class Parent{
	int a;
	void print(){
		System.out.println("부모클래스입니다.");
	}
}
public class Inherit_1 extends Parent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inherit_1 ob = new Inherit_1();
		ob.a = 10;
		ob.print();
	}
}


