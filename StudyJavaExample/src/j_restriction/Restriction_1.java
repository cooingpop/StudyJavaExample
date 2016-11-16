package j_restriction;

class Static{
	static int a = 1;
}
public class Restriction_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static st1 = new Static(); // 새로운 객체 생성
		st1.a = 2;
		System.out.println(st1.a);
		Static st2 = new Static();
		System.out.println(st2.a);
		System.out.println(Static.a);
	}

}
