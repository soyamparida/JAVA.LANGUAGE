package conceptCODES;
public class lec32 {
	
	/*
static void change(int a) {
	a = 98 ;
}
static void change2(int [] arr) {
	arr [0] = 98 ; 
}
	static void telljoke () {
		System.out.println("i ivented a new word!\n " + 
	"plagiarism");
	}
	*/
	
	static void foo() {
		System.out.println("Good morning bro !");
	}
	static void foo(int a ) {
		System.out .println("Good morning bro!" + a );
	}
	static void foo(int a , int b ) {
		System.out .println("Good morning bro!" + a );
		System.out .println("Good morning bro!" + b );
	}
	public static void main(String[] args) {
		/*
		telljoke ();
		 // case 1: changing the integer 
		int x= 43  ;
		change (x); 
		System.out.println("The value of x after running change is:" + x);
		
	 // case 2 
		int [] marks = {34,34,32 ,56,};
		change2(marks);
		System.out.println("The value of x after running change is :" + marks [0]);
		// here at a it didn't  change because a is reference but arr is a method
		*/
		
		// METHODS OVERLOADING 
		foo();
		foo(3000);
		foo(3095 , 456);
	
	}
	
}
