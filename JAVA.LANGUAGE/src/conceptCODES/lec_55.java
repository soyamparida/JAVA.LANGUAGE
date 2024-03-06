package conceptCODES;
interface bicycle {
	int a = 12 ;
      void applybrake(int decrement );
	 void speedup(int increment );
}
interface hornbicycle{
	void blowhornplease();
	void hornblow();/// here we dont need to write public because its already public whatever written interfaces 
}
class Avoncycle implements   bicycle, hornbicycle {
	void blowhorn() {
		System.out.println(" pee pee poo poo");
	}
		public void applybrake(int decrement ) {
		System.out.println("applying brake ");
	}
	public void speedup(int increment ) {
		System.out.println("Applying speed up ");
	}
   public	void blowhornplease() {
	System.out.println("kabhi khusi kabhi gum");
}
	public void hornblow() {
		System.out.println("gum he gum h ");
	}
}

public class lec_55 {
	public static void main(String[] args) {
	Avoncycle cyclesoyam = new Avoncycle();
	cyclesoyam.applybrake(17);
	// you can create properties in interfaces 
System.out.println(cyclesoyam.a);


// you cannot modify the properties in interfaces as they are final 
//cyclesoyam.a= 234;// it will show error cause once you have given the value of a its the final 
//System.out.println(cyclesoyam.a);
cyclesoyam.hornblow();
cyclesoyam.blowhornplease();
}
}