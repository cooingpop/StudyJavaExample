package b_operator;

public class Operator_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean bCompare1 = true && true;
		boolean bCompare2 = true && false;
		boolean bCompare3 = false && true;
		boolean bCompare4 = false && false;
		boolean bCompare5 = true || true;
		boolean bCompare6 = true || false;
		boolean bCompare7 = false || true;
		boolean bCompare8 = false || false;
		boolean bCompare9 = true ^ true;
		boolean bCompare10 = true ^ false;
		boolean bCompare11 = false ^ true;
		boolean bCompare12 = false ^ false;
		boolean bCompare13 = !true;
		boolean bCompare14 = !false;

		System.out.println(" true && true  : " + bCompare1);
		System.out.println(" true && false : " +bCompare2);
		System.out.println("false && true  : " +bCompare3);
		System.out.println("false && false : " +bCompare4);
		System.out.println(" true || true  : " +bCompare5);
		System.out.println(" true || false : " +bCompare6);
		System.out.println("false || true  : " +bCompare7);
		System.out.println("false || false : " +bCompare8);
		System.out.println("  true ^ true  : " +bCompare9);
		System.out.println("  true ^ false : " +bCompare10);
		System.out.println(" false ^ true  : " +bCompare11);
		System.out.println(" false ^ false : " +bCompare12);
		System.out.println("     !true     : " +bCompare13);
		System.out.println("     !false    : " +bCompare14);

	}

}
