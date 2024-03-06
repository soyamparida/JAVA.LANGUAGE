package conceptCODES;
import java.util.Scanner;

public class lec_11 {

	public static void main(String[] args) {
// exercise 1.1
		
		Scanner sc = new Scanner(System.in);
		int  s = sc .nextInt();
	
		System.out.println("Enter the marks of maths");
		int marks = sc.nextInt();
		System.out.println("Enter the marks of science");
		int marks1 = sc.nextInt();
		System.out.println("Enter the marks of english");
		int marks2 = sc.nextInt();
		System.out.println("Enter the marks of social");
		int marks3 = sc.nextInt();
		System.out.println("Enter the marks of hindi");
		int marks4 = sc.nextInt();

		double  percentage = marks + marks1 + marks2 + marks3 + marks4 / 500 *100;
		System.out.println("Enter the percentage of the student : " + percentage );
		
		System.out.println(Math.random());
		System.out.println(Math.random()*s);
		System.out.println(Math.random()*s+1);


	}
}
