package conceptCODES;
import java.util.Scanner; 
 
public class lec13 {

	public static void main(String[] args) {
//String name = new String("soyam");
		String name = "Soyam";
		System.out.println("the name is soyam");
System.out.println(name);
int a = 6;
float b = 5.7f;
System.out.format("the value of a is %d and b is %f :" , a , b );
System.out.printf("the value of a is %d and b is %8.2f :" , a , b );// 6.2 means it takes 8 spaces and before 2 decimals 
/*
%d for int 
%f for float 
%c for  char 
%s for string 
*/
Scanner sc = new Scanner (System.in);
//String st = sc.next();
String st = sc.nextLine();
System.out.println(st);
	}

}
