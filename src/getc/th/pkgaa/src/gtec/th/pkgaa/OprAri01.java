package gtec.th.pkgaa;
import java.util.Scanner;

public class OprAri01 {

	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	
	System.out.println("Enter value for i");
	int i=scn.nextInt();
	System.out.println("Enter value for j");
	int j=scn.nextInt();
	
	System.out.println("Addition: "+(i+j));
	System.out.println("Subraction: "+(i-j));
	System.out.println("Division: "+(i/j));
	System.out.println("Multi: "+(i*j));
	System.out.println("modules: "+(i%j));
	
	}

}
/*
Enter value for i
25
Enter value for j
0.25
Addition: 25.25
Subraction: 24.75
Divition: 100.0
MUlti: 6.25
Modules: 0.0
*/
