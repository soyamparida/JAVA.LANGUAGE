package conceptCODES;
class phone{
	public void showtime (){
	System.out.println("Time is  8 am ");
	}
	public void  on () {
		System.out.println(" turing on the phone  ");
 }
	public void musicwillwork() {
		System.out.println(" it will on ");
	}
}
class smartphone extends phone {
	public  void music  () {
		System.out.println("playing music  ");
	}
	public void off () {
		System.out.println(" Turning on the smartphone ");
	}
}
public class lec_49 {
	public static void main(String[] args) {
	//	phone obj = new phone ();// allowed  
	//	smartphone obj1  = new smartphone ();//allowed 
	 phone obj = new smartphone();// allowed 
	 //smartphone obj1  = new phone ();// npt possible cuz we can only who class to subclass 
//	 obj.music();
	 obj.showtime();
	 obj.on();
	 obj.on();
//obj.off();// wontwork cuzits there in the sub class  
//	 obj.music();
     obj.musicwillwork();
	}
}