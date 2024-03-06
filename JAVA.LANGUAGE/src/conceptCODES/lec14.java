package conceptCODES;

public class lec14 {

	public static void main(String[] args) {
		String name = "Soyam";
	int value = name.length();
System.out.println(value);
String l = name.toLowerCase();
System.out.println(l);
String u = name.toUpperCase();
System.out.println(u);
String nonTrimmedString = "  soyam  ";
System.out.println(nonTrimmedString);
System.out.println(nonTrimmedString.trim());
/*
System.out.println(name.substring(4)); // sunstring
System.out.println(name.substring(0));
*/
System.out.println(name.substring(1,3)); // start is included and end is excluded 
System.out.println(name.replace('o', 'y'));// replace method 
System.out.println(name.replace("soy", "oye")); // replace method 
System.out.println(name.startsWith("soy")); // booleam 
System.out.println(name.endsWith("am"));// boolean 
System.out.println(name.charAt(3));// saying the char at the index entered 
System.out.println(name.indexOf("oy")); // saying the char and returing to the index of that char
/*
String modifiedName = "Harryrry";
System.out.println(modifiedName.indexOf("rry"));
System.out.println(modifiedName.indexOf( "rry" ,  4));// after 4th index 
System.out.println(modifiedName.lastIndexOf("rry", 4 ));
*/
System.out.println(name.equals("Soyam"));// boolean it will show true 
System.out.println(name.equals("soyam")); // false 
System.out.println(name.equalsIgnoreCase("sOyaM")); // DOESS see the captial letter or small letter but the name entered in the string should be same 
 
 // ESCAPE sequence 
System.out.println("i love  my mom \" dad and sister");
System.out.println("i love  my mom \\ dad and sister");

	}

}
