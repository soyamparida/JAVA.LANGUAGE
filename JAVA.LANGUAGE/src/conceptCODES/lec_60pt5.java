package conceptCODES;
interface tvremote {
	void onthetv();
	void offthetv();
}
interface smarttvremote{
	void digitaloff();
	void digitalon();
}
class remote implements tvremote , smarttvremote{

	@Override
	public void digitaloff() {
		System.out.println("tv automatically offing the tv ");
	}

	@Override
	public void digitalon() {
		System.out.println("tv automatcially oning the tv ");
		
	}

	@Override
	public void onthetv() {
		System.out.println("manually oning the tv ");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	@Override
	public void offthetv() {
	System.out.println("manually offing the tv ");
	}
	
}

public abstract class lec_60pt5 {
	public static void main(String[] args) {
		remote re = new remote ();
		re.digitaloff();
		re.digitalon();
		re.onthetv();
		re.offthetv();
	}

}
