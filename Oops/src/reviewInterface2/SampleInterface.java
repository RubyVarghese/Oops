package reviewInterface2;

public class SampleInterface implements InterfacePrint,InterfaceShow{
	public void print() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		
		SampleInterface sm= new SampleInterface();
		sm.print();
	}

}
