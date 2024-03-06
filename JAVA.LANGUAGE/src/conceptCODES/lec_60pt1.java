package conceptCODES;
class dog {
	void jump() {
		System.out.println("the dog is jumping ");
	}
	void bite () {
		System.out.println(" the dog is biting ");
	}
}
interface Basicanimal {
	void eat();
	void sleep ();
}
class human extends dog implements Basicanimal {
	public void eat () {
		System.out.println("dog is eating banana ");
	}
	public void sleep () {
		System.out.println("dog is sleeping ");
	}

		
	}

public class lec_60pt1 {
	public static void main(String[] args) {
		
		human h = new human();
		h.bite();
		h.eat();
		h.jump();
		h.sleep();
		// successfully done
		 
		 
		
		Basicanimal soyam = new human ();
		soyam.eat();
		soyam.sleep();
		
	}

}
