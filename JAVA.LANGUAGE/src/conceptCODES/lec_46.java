package conceptCODES ;
class base1{
	base1( ){
		System.out.println("im a constructor");
	}
	base1(int x){
System.out.println(" im an overloaded constructor with value of a as; " + x);
	}
	int x;
	public int getx() {
		return x;
	}
	public void setx(int x) {
		this.x =x ;
	}
}
class derived1 extends base1{
	derived1 (){
		  super(0); 
		System.out.println(" i am a derived class constructor");
	}
	derived1 (int x , int y){
		super(x);
		System.out.println(" im an overloaded constructor of derived  value of y as; " + y);
	}
	int y ; 
	public int gety(){
		return y; 
	}
	public void sety(int y) {
		this.y = y;
	}
}
class childofderived extends derived1{
	childofderived(){
		System.out.println(" im a child of derived construtor");
	}
	childofderived(int x , int y , int z ){
		super(x,y);
		System.out.println(" im a child of derived construtor of derived with value of z as : " + z);

}
}

public class lec_46 {
	public static void main(String[] args) {
	 //base1 b = new base1(); 
     //derived1 d = new derived1();
       derived1 d = new derived1(2 ,4);	
       childofderived cd = new childofderived (23,45,34);
      
	}
}
