package k_constructor;

class Calc{
	int x, y, sum;
	void set(int x, int y){
		this.x = x;
		this.y = y;
	}
	int GetSum(){
		return x+y;
	}
	void printData(){
		sum = GetSum();
		System.out.println("x =" + x  + ", y = " + y);
		System.out.println("합 = " + sum);
	}
}
public class Constructor_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc data = new Calc();
		data.set(10, 20);
		data.printData();
	}

}
