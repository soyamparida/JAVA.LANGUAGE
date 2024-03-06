package conceptCODES;
 import java.util.Scanner ; 
 
public class lec16 {

	public static void main(String[] args) {
	int age  ; 
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter the user age:");
	age = sc.nextInt();
	if (age>=19) {
		System.out.println("yes boy you can drive ");
	}
	else {
		System.out.println("moye moye");
	}
	}

}
