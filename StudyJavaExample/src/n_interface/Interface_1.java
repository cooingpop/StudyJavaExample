package n_interface;

interface Hi{ // 인터페이스 Hi 정의
	void hi(); // 추상메서드 Hi() 선언
}

interface Say extends Hi{ // 인터페이스 Hi를 상속받는 Say
	void say(); // 추상메서드 say()선언
}

class Hey implements Say{ // 인터페이스 Say를 구현
	public void hi(){ // 추상메서드 hi() 오버라이딩
		System.out.println("안녕하세요.");
	}
	public void say(){ // 추상메서드 say() 오버라이딩
		System.out.println("잘 부탁드립니다.");
	}
}

public class Interface_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hey h = new Hey();
		h.hi();
		h.say();
	}
}


