package conceptCODES;

public class lec33 {
	/*
static int sum(int a , int b) {
	return a+b  ; 
}
static int sum (int a , int b , int c) {
	return a+b+c ; 
}
*/ 
	static int sum (int x  , int...arr) {
		// Available as  int [] arr ; 
		int result = 0 ; 
		for  (int a: arr) {
			result += a ; 
		}
		return result ;
	}
	public static void main(String[] args) {
		 // System.out.println("the sum of two int is:" + sum ()); // if you add a int in the method then it can't be left empty
		System.out.println("the sum of two int is:" + sum (2)); 
		System.out.println("The sum of two int is" + sum(3,9));
		System.out.println("the sum of two int is:" + sum (4,9 ,8));
		System.out.println("the sum of two int is:" + sum (4,9,8 ,3,6,5,9,3,54,3,3,3));
	}
	

}
