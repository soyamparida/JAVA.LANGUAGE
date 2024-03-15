package practice;
// ACCESS MODIFIERS
class c1 { 
	public int x = 3 ; 
	protected int y =  4 ; 
	int z =  5 ; 
	private int a  = 34  ; 
	public void meth1 () { 
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(a);
	}
}
public class lec66 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
c1 c  = new c1 () ; // for class 
// class 

//c.meth1();

// package 
		System.out.println(c.x) ;
		System.out.println(c.y) ;
		System.out.println(c.z) ;
		//System.out.println(c.a) ; t shows error 
		
	}

}
