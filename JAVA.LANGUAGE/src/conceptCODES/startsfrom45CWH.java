package conceptCODES;
class base{
	int x;
	public int getx() {
		return x;
	}
	public void setx (int x) {
		System.out.println("im setting x now ");
		this.x = x;
	}
	public void printme() {
		System.out.println(" im a constructor");
	}
}
class derived extends base{
	int y;
	public int gety() {
		return y ;
	}
	public void sety(int y) {
		System.out.println("im setting y now ");
		this.y= y;
	}
}
public class startsfrom45CWH {
	public static void main(String[] args) {
	base b = new base();
b.setx(23);
System.out.print(b.getx());
derived d = new derived();
d.sety(34);
System.out.println(d.gety());
System.out.println(b.getx());// because this x is there in both base and deived as we wrote extends 
	}
}
