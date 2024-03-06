package conceptCODES;

public class lec26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		you have to store  marks of 500 students
		you have 2 options :
		1.Create 500 variables 
		3.Use Arrays (recommended) 
		
*/
		/*
		int marks [] = new int [5];
		marks [0] = 12 ; 
		marks [1] = 15 ;
		marks [2] = 85 ; 
		marks [3] = 45 ;
		marks [4] =88;
		System.out.println(marks[0]);
		System.out.println(marks[3]);
		System.out.println(marks[4]);
		System.out.println(marks[2]);
		*/
		int marks [] = {45,65,77,78,88}  ;
		System.out.println(marks[2]);
		System.out.println(marks[5]); // it will show an error becuase  no of element is  0 1 2 3 4 which is five 
	}

}
