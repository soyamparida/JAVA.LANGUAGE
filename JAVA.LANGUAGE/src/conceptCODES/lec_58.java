package conceptCODES;
 interface sampleInterface{
	 void meth1();
	 void meth2();
 }
interface childsampleInterface extends  sampleInterface{
	void meth3();
	void meth4();
}
class Mysampleclass implements childsampleInterface{
	public void meth1() {
		System.out.println("meth1");
	}

	@Override
	public void meth2() {
		System.out.println("meth2");	}
	@Override
	public void meth3() {
	System.out.println("meth3");
	}
	@Override
	public void meth4() {
	System.out.println(" meth4");
	}
}
public class lec_58 {
	
	  public static void main(String[] args) {
	Mysampleclass obj = new Mysampleclass();
	
	obj.meth1();
	obj.meth2();
	obj.meth3();
	obj.meth4();
	System.out.println();


	  }
}	


