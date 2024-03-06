package conceptCODES;
 abstract class parent{
   public void  parent() {
			System.out.println(" Mai base2 ka constructor hoon");
	}
	public void sayhello() {
		System.out.println("Hello");
	}
	abstract public void greet ();// if one method is abstract then we have  to declare that whole class is abstract 
	abstract public void greetagain ();
}
  class child  extends parent{
	  @Override
	  public void greet () {
		  System.out.println("Good Morning");
	  }
	  @Override
	 public void greetagain () {
		 System.out.println(" Good Night ");
	 }
  }
   abstract class child2  extends parent {
	  public void the() {
		  System.out.println(" the ");
		  // here method is different but we took the class as abstract so no problem  
	  }
  }
  // abstract class ka kabhi object nhi ban sakta 
public class lec_53 {
	public static void main(String[] args) {
		//parent p = new parent ();// it will show a error cuz it is  abstract class 
        child c = new child () ;
      //  child2 c = new child2();// it will show error as the same above case 
}
}