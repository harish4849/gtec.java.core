package gtec.th.topinstanceof;


class p01a{
	int x,y;
	}
	class p01b{
		int x,y;
	}

public class p01 {

	public static void main(String[] args) {
			
	p01a a1=new p01a();
	p01a a2=a1;
	
	p01b b1=new p01b();
	
	a1.x=1; a1.y=3;
	a2.x=2; a2.y=6;
	b1.x=4; b1.y=7;
	
	
	System.out.println(a1 instanceof p01a);
	System.out.println(a2 instanceof p01a);
	//System.out.println(a1 instanceof p01b);
	//Incompatible conditional operand types p01a and p01b
	System.out.println(b1 instanceof p01b);
	
	
	}
	}


