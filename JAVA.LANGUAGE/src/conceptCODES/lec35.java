package conceptCODES;

public class lec35 {

	public static void main(String[] args) {
		/*
		  // break statement 
		   *  
		for (int i = 1 ; i<=51 ; i++ ) {
			System.out.println(i);
			if (i==40) {
				break ;
			}
			*/
		/*
		int i = 1 ; 
		while (i<6) {
			System.out.println(i);
			i++ ;
			if (i==40) {
				break ;
			}
		
		}
	*/
		/*
		int i = 1;
		do {
			System.out.println(i);
			i++ ;
			if (i==3) {
				break ;
			}
		}while(i<10);
		*/
		
		 // continue
		
		for (int i = 1 ; i<=51 ; i++ ) {
			if (i==40) {
				continue  ;
			}
			System.out.println(i); 
		}
		int i = 1;
		do {
			i++ ;
			if (i==3) {
				System.out.println("Ending the loop");
				continue;
			}
			System.out.println(i);
			System.out.println("java is great ");
		}while(i<10);
		System.out.println("Loop ends here");
	}
}

