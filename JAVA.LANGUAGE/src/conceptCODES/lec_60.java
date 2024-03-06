package conceptCODES;
// question 1 , 2 
abstract class pen {
abstract void write  ();
abstract void refill ();
}
class fountainpen extends pen {

	@Override
public 	void write() {
	System.out.println("Writer");
	}

	@Override
	public void refill() {
		System.out.println("Refill");
		
	}
	void changename  () {
		System.out.println("changing the name");
	}
}
public class lec_60 {
	public static void main(String[] args) {
		// practice set after oops 
		fountainpen pe = new fountainpen ();
	pe.changename();
	pe.refill();
	pe.write(); 
}
}