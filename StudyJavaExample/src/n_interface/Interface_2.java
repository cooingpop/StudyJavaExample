package n_interface;

interface My{
	void name();
}
public class Interface_2 implements My{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface_2 i = new Interface_2();
		System.out.print("My name is " );
		i.name();
				
	}
	public void name(){
		System.out.println("popcorn");
	}
}

