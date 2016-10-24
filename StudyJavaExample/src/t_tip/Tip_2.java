package t_tip;

import java.util.Scanner;

public class Tip_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * equals 와 ==의 차이점
		 *
		 * equals는 메서드
		 *
		 * == 는 연산자
		 *
		 * equals 메서드는 대상의 내용을 비교
		 * == 는 대상의 주소값 비교
		 *
		 * string pooling
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Input data1");
		String str = "";
		str = scan.nextLine();
		System.out.println("Input data2");
		String str2 = "";
		str2=scan.nextLine();
//		String str = "a";
//		String str2 = "a";
		String str3 = str;
		String str4 = "a";
		String str5 = "a";

		System.out.println("str==str2 : " + (str==str2));
		System.out.println("str2==str3 : " + (str2==str3));
		System.out.println("str==str3 : " + (str==str3));
		System.out.println("str4==str5 : " + (str4==str5));
		System.out.println("");
		System.out.println("str.equals(str2) : " + (str.equals(str2)));
		System.out.println("str2.equals(str3) : " + (str2.equals(str3)));
		System.out.println("str.equals(str3) : " + (str.equals(str3)));
		System.out.println("str4.equals(str5) : " + (str4.equals(str5)));



		scan.close();

		/*
		 *
		 * In above statement, either 1 or 2 string will be created.
		 * If there is already a string literal “Cat” in the pool,
		 *  then only one string “str” will be created in the pool.
		 *  If there is no string literal “Cat” in the pool,
		 *  then it will be first created in the pool and then in the heap space, 
		 *  so total 2 string objects will be created.
		 *  
		 *   
		 	String s1 = "Cat";
        	String s2 = "Cat";
        	String s3 = new String("Cat");
        
        	System.out.println("s1 == s2 :"+(s1==s2));
        	System.out.println("s1 == s3 :"+(s1==s3));
        	


		I don't think it actually does much, it looks like it's just a cache for string literals. If you have multiple Strings who's values are the same, they'll all point to the same string literal in the string pool.
		
		String s1 = "Arul"; //case 1 
		String s2 = "Arul"; //case 2 
		
		In case 1, literal s1 is created newly and kept in the pool. But in case 2, literal s2 refer the s1, it will not create new one instead.
		
		if(s1 == s2) System.out.println("equal"); //Prints equal. 
		
		String n1 = new String("Arul"); 
		String n2 = new String("Arul"); 
		if(n1 == n2) System.out.println("equal"); //No output.  


		 * 
		 * 
		 */
	}

}
