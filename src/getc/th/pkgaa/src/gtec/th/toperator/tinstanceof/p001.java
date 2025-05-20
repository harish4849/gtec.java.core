package gtec.th.toperator.tinstanceof;

public class p001 {

	public static void main(String[] args) {
		String s1=null;
		String s2=new String();
	    String s3="fox";
	    String s4="box";
	    
     System.out.println(s1 instanceof String);
     System.out.println(s2 instanceof String);
     System.out.println(s3 instanceof String);
     System.out.println(s4 instanceof String);
     
	}

}
/*false
true
true
true
*/
