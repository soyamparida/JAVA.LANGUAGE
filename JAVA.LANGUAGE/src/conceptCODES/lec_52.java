package conceptCODES;
// question 1 

class circle{
	int radius ;
	circle (){
		System.out.println(" I am non param of circle ");
	}
	circle(int r ){
		System.out.println(" i am circle parameterized constructor " + r);
		this.radius = r ;                                 
	}
	public double area() {
		return Math.PI*this.radius*this.radius;
	}
}
 class cylinder1 extends circle {
	 public int height ;
	 cylinder1(  int r , int h){
		 super(r);
		 System.out.println(" i am cylinder1 parameterized constructor" + h);
		 this.height = h ;
	 }
	 public double volume() {
		 return Math.PI*this.radius*this.radius*this.height;
	 }
 }
 /*
public class lec_52 {
	public static void main(String[] args) {
		// problem 1 
		circle objc = new circle (34);
  cylinder1 obj = new cylinder1 (12 , 34);   
	}
	/*
class rectangle {
public  int length ;
public  int breadth ;
public int height ;
 rectangle (){
	 System.out.print(" im  a rectangle ");
 }
 rectangle (int l,int b){
  System.out.println("this is the length of the rectangle " + l);
  this.length = l;
  System.out.println("this is the breadth of the rectangle" + b);
  this.breadth = b;
  }

rectangle (int b){
 System.out.println(" i am the breadth of the rectangle" + b);
	  this.breadth = b;
  }
 class cuboid extends rectangle {
	 cuboid (){
		 System.out.println("i am cuboid");
	 }
	 cuboid (int l,int b , int h){
		 super(l,b);
		 System.out.println("this is cuboid height " + h);
		 this.height=h;
	 }  
public class lec_52 {
	public static void cwh_52(String[] args) {
		rectangle rec = new rectangle(6,9);
}
}
}
}
*/
