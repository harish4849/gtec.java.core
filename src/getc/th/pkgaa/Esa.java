package getc.th.pkgaa;
import java.util.Scanner;
/*
 Employ salary Allowance
 */
public class Esa {

	public static void main(String[] args) {
		
	Scanner scn=new Scanner(System.in);
	int eid;
	String ename;
	double sal,hra,da,pf,gp,np;
	 System.out.println("Enter EID");
	 eid=scn.nextInt();
	 System.out.println("Enter value for ENMAE");
	 ename=scn.next();
	 System.out.println("Enter value for SAL");
	 sal=scn.nextDouble();
	 hra=sal*20/100;
	 da=sal*15/100;
	 pf=sal*35/100;
	 gp=hra+da+sal;
	 np=gp-pf;
	 System.out.println("House rent Allowance: "+hra);
	 System.out.println("Dearness Allowance: "+da);
	 System.out.println("Provident Fund: "+pf);
	 System.out.println("Gross Pay: "+gp);
	 System.out.println("Net Pay: "+np);
	 
	}

}

/*
 * Enter EID
101
Enter value for ENMAE
harish
Enter value for SAL
15000
House rent Allowance: 3000.0
Dearness Allowance: 2250.0
Provident Fund: 5250.0
Gross Pay: 20250.0
Net Pay: 15000.0
*/
