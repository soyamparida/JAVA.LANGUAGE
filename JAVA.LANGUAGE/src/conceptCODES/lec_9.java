package conceptCODES;

public class lec_9 {

	public static void main(String[] args) {
		// precedence of operator 
		// +  - have less precedence than the * / 
    //  int a = 6*5-34/2;
      /*
      =30-34/2
      = 30 - 17
      = 13
      */
   //   int b= 60/5-34*2;
      /*
       = 12-34*2
       = 12 - 68 
       = -56
       */
    //  System.out.println(a);
    //  System.out.println(b);
      // precedence and Associativity
      // quick quiz 
      /*
      int x = 3  ;
      int y = 2 ; 
      int z = x * y/2;
      System.out.println(z);
      */
		
      int a = 3  ;
      int b = 2 ; 
      int c = 10;
     // int k = b*b - 4*a*c;
      int s = b*b - (4*a*c)/(2*a);
      System.out.println(s);
     
      }

}
