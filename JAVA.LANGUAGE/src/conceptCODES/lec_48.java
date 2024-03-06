package conceptCODES;
class A{
	int x ;
	public int harry () {
		return 4 ;
	}
	public void meth2(int i  ) {
		System.out.println(" I  am method 2 of class A ");
	}
}
class B extends A {
	public void meth2(){
		System.out.println(" i am method 2 of class B");
	}
	public void meth3() {
		System.out.println("i am method 3 of class B");
	}
}
public class lec_48 {
	public static void main(String[] args) {
	A a = new A();
	a.meth2(32);

	B b = new B();
	b.meth3();
	b.meth2();
}
}
// override method 