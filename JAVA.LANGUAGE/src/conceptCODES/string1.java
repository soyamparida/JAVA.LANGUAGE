package conceptCODES;
class employee1 {
	 int id ; 
	String name ; 
	
	public String getName () {
		return name ;
	}
	public void setName() {
		
	}
}
public class string1 {

	public static void main(String[] args) {
		employee1 os = new employee1 ();
		os.id = 34 ; 
		os.name= "soyam";
		System.out.println(os.id);
		System.out.println(os.name);
	    }

}
