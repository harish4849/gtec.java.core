package getc.th.pkgaa;
import java.util.Scanner;

public class Inputstatement02 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter value for string");
		String s=scn.nextLine();
		System.out.println("String value: " +s);
	}

}
/*
Enter value for string
sun day
String value: sun day
*/