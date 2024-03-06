package conceptCODES;

import java.util.Scanner;

public class practiceset2 {

	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the number of seconds " + t);
		int  t = sc.nextInt();
		System.out.println("Enter the number of seconds " + t);
		//float t = sc.nextFloat();
        double g = 32.174 ;
   // double  distance =  0.5*g*t*t; if you write t likethis not possible so 
        double dis = 0.5*g*Math.pow(t, 2);
        double distance = 3280.8399 * dis ; // in feet 
    System.out.println("the distance travelled " + distance);
//   System.out.println("the number of distance traveled ");
 * */

 

	// 	home assignment  1
		/*
		Scanner sc  = new Scanner(System.in);
	    // Prompt user for number of minutes
	    System.out.println("Enter the number of minutes:");
	    int minutes = sc.nextInt();

	     // Number of minutes in a year
	     
	    int year = minutes / 525600;// one year have 525600
	    int day = minutes / 1440;
	    System.out.println(minutes + " minutes is " + year + " years and "  +  day + " days ");
		*/
		/*
		 int   a, b;
	        System.out.println("a        b        pow(a, b)");
	        a = 1;
	        b = 2;
	        
	        System.out.println(a + "        " + b +   "        " + Math.pow(a, b));
	                                                           
	        a++;
	        b++;
	        
	       System.out.println(a + "        " + b +  "        " + Math.pow(a, b)); 
	 
	        a++;
	        b++;
	       System.out.println(a + "        " + b +   "        " + Math.pow(a, b));
	         
	        a++;
	        b++;
	       System.out.println(a + "        " + b +   "        " + Math.pow(a, b));
	          
	        a++;
	        b++;
	       System.out.println(a + "        " + b +  "        " + Math.pow(a, b)); 
	        		
	            // IF WE TAKE LIKE LIKE THIS ALSO CORRECT BUT MATH.PAW WILL ALWAYS COME IN DECIMAL ]
	             
	             
	      //  SO WE  HAVE TO USE THIS METHOD THIS SECOND ONE 
		
		float a, b;
        System.out.println("a        b        pow(a, b)");
        a = 1;
        b = 2;
        
        System.out.println((int)a + "        " + (int)b +   "        " + (int)Math.pow(a, b));
                                                           
        a++;
        b++;
        
       System.out.println((int)a + "        " + (int)b +  "        " + (int)Math.pow(a, b)); 
 
        a++;
        b++;
       System.out.println((int)a + "        " + (int)b +   "        " + (int)Math.pow(a, b));
         
        a++;
        b++;
       System.out.println((int)a + "        " + (int)b +   "        " + (int)Math.pow(a, b));
          
        a++;
        b++;
       System.out.println((int)a + "        " + (int)b +  "        " + (int)Math.pow(a, b)); 
        		// ITS IS CORECT 
		
		// question 3 
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the three points of the triangle" + a + a1 + b + b1 + c + c1);
		System.out.println("a");
		float a = sc.nextFloat();// a a1  b b1 c c1 
		System.out.println("a1");
		float a1 = sc.nextFloat();
		System.out.println("b");
		Float b = sc.nextFloat();
		System.out.println("b1");
		int  b1 = sc.nextInt();
		System.out.println("c");
		float c = sc.nextFloat();
		System.out.println("c1");
		Float c1 = sc.nextFloat();
		System.out.println("Enter the three points of the triangle" + a + a1 + b + b1 + c + c1);
		System.out.println("d");
		int side1 = 2;
		int side2 = 5;
		int side3 =  6; 
		float s = side1+side2+side3/2; // side formula
		double area = Math.sqrt(s)*Math.sqrt(s-side1)*Math.sqrt(s-side2)*Math.sqrt(s-side3);
	    System.out.println("the area of the triangle is " + area);
	   // double area1 = [a(b1-c1) + b(c1-a1) + c(a1-b1)]/2;	    
	
		//using command line  Argument 
		/*
		Scanner sc = new Scanner(System.in);
		int n = 16 ; // dividend 
		int p = 4 ; // divisor 
		int r = n/p; // quotient 
		System.out.println(args[9890]);
		int u = p%n;
		System.out.println(u);
		*/
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the distance between two cities in km");
		int  km = sc.nextInt();
		int meters = km * 1000;
		System.out.println("convert the distance in km to meters");
		System.out.println(meters);
		System.out.println("convert the distance from km to feet");
		double feet = km *3280.8399;
		System.out.println(feet);
		System.out.println("convert the distance from km to inch");
		double inch = km *39370.0787 ; 
		System.out.println(inch);
		System.out.println("convert the distance from km to centimeter");
		long centimeter = km * 100000;
		System.out.println(centimeter);
		
		*/
		/*
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the basic salary");
	    long basicsalary = sc.nextLong();
	  double da = basicsalary * 40/100;
	  System.out.println("DA is" + da);
	  double hra = basicsalary * 20/100;
	  System.out.println("HRA is" + hra);
	  double Grosssalary = basicsalary + da + hra ;
	  System.out.println( "grosssalary is " + Grosssalary);
	  */
   /*
		Scanner sc = new Scanner(System.in);
		double pi = Math.PI;
		int r = sc.nextInt();
		System.out.println("Enter the radius of the hemisphere" + r);
 double surfacearea = 3*pi*r*r;
 System.out.println("the surface area of the hemisphere" + surfacearea);
 double volume = (2*pi*r*r*r)/3;
 System.out.println("the volume of the hemisphere "+ volume);
 */
	       
		// output type questions 
		/*
	    Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of eggs
        System.out.print("Enter the number of eggs: ");
        int totalEggs = scanner.nextInt();

        // Calculate dozens and remaining eggs
        int dozens = totalEggs / 12;
        int remainingEggs = totalEggs % 12;

        // Calculate gross, dozens, and remaining eggs
        int gross = totalEggs / 144;
        int remainingDozens = (totalEggs % 144) / 12;
        int remainingEggs2 = (totalEggs % 144) % 12;

        // Display the results
        System.out.println("Your number of eggs is " + dozens + " dozen and " + remainingEggs + " eggs.");
        System.out.println("Or, it is " + gross + " gross, " + remainingDozens + " dozen, and " + remainingEggs2 + " eggs.");

        // Close the scanner
        scanner.close();
        */
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a Fahrenheit temperature
        System.out.print("Enter temperature in Fahrenheit: ");

        // Read the Fahrenheit temperature from the user
        double fahrenheit = sc.nextDouble();

        // Close the scanner to avoid resource leak
        sc.close();

        // Convert Fahrenheit to Celsius using the formula: C = (F - 32) * 5/9
        double celsius = (fahrenheit - 32) * 5/9;

        // Display the result
        System.out.println("Temperature in Celsius: " + celsius);
        
        
	  }	
		
	}

	