package gtec.th.toperator.tconcatenate;
import java.util.Scanner;

public class p001 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int i=scn.nextInt();
		String s=scn.next();
		
		System.out.println(i+s);
		System.out.println(s+i);
		System.out.println(i+i);
		System.out.println(s+s);
		

	}

}
/*
5
9
59
95
10
99
*/