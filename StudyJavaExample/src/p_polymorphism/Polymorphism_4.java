package p_polymorphism;

class Shape{
	
	String color;
	
	void draw(){
		System.out.println("그린다.");
	}
	
	void paint(String color){
		this.color = color;
		System.out.println(this.color + " 색칠한다.");
	}
}

class Circle extends Shape{
	String type;
}

class Rectangle extends Shape{
	String type;
	void draw(){
		System.out.println("Rectangle");
	}
}
public class Polymorphism_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s1 = new Circle();
		s1.paint("RED");
		Shape s2 = new Rectangle();
		s2.draw();
	}

}
