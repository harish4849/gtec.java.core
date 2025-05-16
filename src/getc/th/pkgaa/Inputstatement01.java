package getc.th.pkgaa;
import java.util.Scanner;
public class Inputstatement01 {

	public static void main(String[] args) {
		int i;
		float j;
		double k;
		boolean l;
		String s;
		char ch;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter value for int ");
		i=scn.nextInt();
		System.out.println("Entyer value for float");
		j=scn.nextFloat();
		System.out.println("Enter value for double");
		k=scn.nextDouble();
		System.out.println("Enter value for boolean");
		l=scn.nextBoolean();
		System.out.println("Enter value for string");
		s=scn.next();
		System.out.println("Enter value for charcter");
		ch=scn.next().charAt(0);

		System.out.println( i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
		System.out.println(s);
		System.out.println(ch);
	
	}

}
/*
 Enter value for int 
5
Entyer value for float
4.5
Enter value for double
6.5
Enter value for boolean
true
Enter value for string
monday
Enter value for charcter
sunday
5
4.5
6.5
true
monday
s
*/

