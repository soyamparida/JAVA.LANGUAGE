package conceptCODES;

public class lec17 {
	public static void main(String[] args) {
	boolean a = false;
	boolean b = false; 
	boolean c  = false ;
	System.out.println("forlogical And");
if (a && b  && c ) {// for both  true it wlll print true if one also false then false 
	System.out.println("y");
}
else { 
	System.out.println("N");
}
System.out.println("Forlogical or");
if (a||b||c) { // evaluate to true when atleast one of the condition is true 
	System.out.println("y");
}
else {
	System.out.println("okok");
}

System.out.println("Forlogical not");

System.out.println("Not(a) is ");
System.out.println(!a);
System.out.println("Not(b) is ");
System.out.println(!b);
	}

	}
