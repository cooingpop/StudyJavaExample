package p_polymorphism;

class Over{
	int a=10;
}
public class Polymorphism_1 extends Over{
	int a = 20;	// 오버라이드
	void print(){
		System.out.println(super.a); // 부모로부터 물려받은 멤버, 10 출력
		System.out.println(this.a); // 자식이 다시 정의한 멤버, 20 출력
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymorphism_1 ob = new Polymorphism_1();
		ob.print();
	}
}
