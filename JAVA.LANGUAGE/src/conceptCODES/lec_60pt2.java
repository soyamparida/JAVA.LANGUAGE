package conceptCODES;
class monkey {
	public void jump () {
		System.out.println(" The monkey is jumping ");
	}
	public void bite () {
		System.out.println("The monkey is biting ");
	}
	interface Basicanimal{
		void eat ();
		void sleep();
	}
	class Human extends monkey implements Basicanimal{
		@Override
		public void eat() {
			System.out.println(" monkey eating banana ");
		}

		@Override
		public void sleep() {
			System.out.println(" monkey is sleeping ");		
		}
		public void speak () {
			System.out.println(" he is speaking ");
		}
	}
}
public class lec_60pt2 {
	public static void main(String[] args) {
		
	human  nnkm = new human ();  
	nnkm.eat();
	nnkm.bite();
	nnkm.jump();
	 // nnkm.speak() ; error 
	 monkey mon =  new monkey  () ;
	 mon.bite();
	 mon.jump();
	
	
	}
}
