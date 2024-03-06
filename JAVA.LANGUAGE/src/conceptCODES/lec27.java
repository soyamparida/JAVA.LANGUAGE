package conceptCODES;

public class lec27 {

	public static void main(String[] args) {
		 // displaying array in for loop 
		
		int [] marks = {34,22,45,32,54} ;
		float [] marks1  = {23.5f , 23.34f, 54.32f ,34.23f}; 
		System.out.println(marks[2]);
		System.out.println(marks.length); // for unknowing the length
		System.out.println(marks1[3]);
		
		// displaying array in (for loop) 
		System.out.println("printing using for loop");
		for(int i = 0 ;  i<marks.length ; i++) {
			System.out.println(i);	
		}
		System.out.println("printing using for loop in reverse order ");
		for (int i = marks.length -1 ;  i >= 0 ; i--) {
			System.out.println(marks[i]);
			// for each loop  
		 	for (int soyam : marks ) {
		 		System.out.println (soyam);
		 	}
		}
	}

}
