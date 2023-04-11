package superpgmAssignment;

public class AdditionResult {
	private int a;
	private int b;
	private int c;
	
	public AdditionResult(int a, int b) {
		this.a=a;
		this.b=b;
	}
	public int  sum()
	{
		c= a+b;
		System.out.println("Sum of 2 numbers "+c);
		return c;
	}

}
