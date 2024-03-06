package conceptCODES;

import java.util.Scanner;

public class lec18 {
	public static void main(String[] args) {
		
		System.out.println("Enter Your Age");
		
	Scanner sc = new Scanner(System.in);
int age = sc.nextInt();

/*
	if (age>50) {
		System.out.println("you are experiencend");
	}
	else if (age>18 && age<30) {
		System.out.println("semi ex");
	}
	else if (age<=30) {
		System.out.println(" you are not ");
	}
	else {
		System.out.println(" nothing ");
	}
	*/

switch(age) {
case 18:
	System.out.println("you are going to be 18");
	break;
case 50:
	System.out.println("you are going to be 50");
	break;
case 100:
	System.out.println("you are going to be 100");
	break;
	default :
		System.out.println("you sre just born");

}
	}
	
	}


