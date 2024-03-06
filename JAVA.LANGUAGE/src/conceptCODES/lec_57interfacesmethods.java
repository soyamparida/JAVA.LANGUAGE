package conceptCODES;

interface Mycamera {
	void  takesnap();
	void  recordvideo();
	private void  greet () {
		System.out.println(" Good morning ");
	}
	default  void record4kvideo(){ // it is use cause after  adding  the the interfaces if you want to ad this method in the implement class you have to use default 
		greet  ();
		System.out.println(" record in 4k video ");// and if you dont add this method in class then it will take the default one 
	// if you write greet after wards it wont take 
	} 
}
interface Mywifi {
	String[]getnetwork();
	void connnectTonetwork(String network);
}
class  Mycellphone{
	void callnumber (int phonenumber ) {
		System.out.println(" Cslling" + phonenumber);
	}
void pickcall () {
	System.out.println(" connecting...");
}
class mysmartphone extends Mycellphone implements Mywifi , Mycamera{
	public void takesnap () {
		System.out.println(" Taling snap");
	}

	public void record4kvideo() {
	System.out.println("recording quality improves");// or else this one if both are added then  it will chooae this one  
	}
	
	public void recordvideo() {
	System.out.println(" Taking snap ");	
	}
	public String[] getnetwork() {
	System.out.println("Getting list of Networks");
	String [] networkList ={"Harry", "Prashanth","Anjali56"};
		return networkList;
	}

	public void connnectTonetwork(String network) {
		System.out.println("Connecting to" + network);
	}
}
}
/*
public class lec_57interfacesmethods {
	public static void main(String[] args) {
	mysmartphone ms = new mysmartphone () ;
	String[] ar = ms.getnetwork(); 
	ms.record4kvideo();
	ms.greet();
	for (String item: ar) {
		System.out.println(item);
	}
}
// redo 
}
*/
