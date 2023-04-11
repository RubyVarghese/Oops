package superpgmAssignment;

public class CheckResult extends AdditionResult {
	private int d;

	public CheckResult(int a,int b) {
		super(a,b);
	}
		public int DividionResult()
		{
			d = sum()%10;
			if(d==0)
			{
				System.out.println("The sum is dividible by 10");
			}
			else
			{
				System.out.println("The sum is not divisible by 10");
			}
			return d;
		}

	public static void main(String[] args) {
		CheckResult cr= new CheckResult(15,5);
		cr.DividionResult();
	}

}
