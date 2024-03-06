 package conceptCODES;
interface  Mycamera2{
	void takesnap();
	void recordvideo();
	private void greet () {
		System.out.println("Good Morning ");
	}
	default void record4kvideo() {
		greet();
		System.out.println(" Recording in 4k...");
	}
}
interface mywifi2 {
	String [] getNetworks ();
	void connectToNetwork(String network);
}
class Mycellphone2{
	void callNumber(int phonenumber) {
		System.out.println("Connecting...");
	}
}
class MySmartphone2 extends Mycellphone2 implements  mywifi2 , Mycamera2{// smartphone mai camera implement hoga camera mai smartphonr nhi 
public void takesnap() {
	System.out.println(" Getting List of networks ");
	String [] networkList = { " Harry","  Prashanth", "Anjali56"};
}
public void recordvideo() {
	System.out.println("Taking snap");
}
public void record4kvideo () {
	System.out.println("Taking snap and recording in 4k ");
}
public String [] getNetworks () {
	System.out.println("Getting List of networkd ");
	String []networkList = {"harry", "prashanth", "Anjsli56"};
	return networkList;
}
public void connectToNetwork(String network ) {
	System.out.println("connecting to " + network);
}
public void samplemeth () {
	System.out.println("Meth");
}
}

public class lec_59 {
	public static void main(String[] args) {
		Mycamera2 cam1 = new  MySmartphone2();// it is as a camera // aur isme bas camera ka method use kar sakte h sp ka  nhi 
		cam1.takesnap();
	//	cam1.samplemeth();// it will show error cause samplemeth toh samrtphone kamethod hai not camera ka
		MySmartphone2 s = new MySmartphone2();// it will take all the methods 
		s.samplemeth();
		s.connectToNetwork(null);
		s.record4kvideo();
		s.takesnap();
		s.getNetworks();
		s.recordvideo();
	}
}
