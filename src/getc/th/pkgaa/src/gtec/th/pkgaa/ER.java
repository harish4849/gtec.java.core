package gtec.th.pkgaa;
import java.util.Scanner;
public class ER {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter value for Rollnm.");
		int rol=scn.nextInt();
		System.out.println("Enter value for SNAME");
		String Sname=scn.next();
		System.out.println("Enter mark 1");
		double m1=scn.nextDouble();
		System.out.println("Enter value for mark 2");
		double m2=scn.nextDouble();
		double tot=m1+m2;
		System.out.println("TOTAL: "+tot);
		double avg=tot/2;
		System.out.println("AVERAGE: "+avg);
		String result=m1 > 34.4 && m2> 34.4 ?"pass":"fail"; 
		System.out.println("RESULT: "+result);
	}

}
/*
Enter value for Rollnm.
101
Enter value for SNAME
hari
Enter mark 1
60
Enter value for mark 2
75
TOTAL: 135.0
AVERAGE: 67.5
RESULT: pass
*/

/*
Enter value for Rollnm.
102
Enter value for SNAME
harish
Enter mark 1
32
Enter value for mark 2
56
TOTAL: 88.0
AVERAGE: 44.0
RESULT: fail
*/