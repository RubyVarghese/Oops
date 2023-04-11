package review;

public class Rectangle extends Shape {
	public  void  print() {
		super.print();
		System.out.println("this is rectangle");
		
	}

	public static void main(String[] args) {
		Rectangle rc=new Rectangle();
		rc.print();
		
	}

}
