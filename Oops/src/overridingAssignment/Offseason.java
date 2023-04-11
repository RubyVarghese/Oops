package overridingAssignment;

public class Offseason extends Onseason {
	private static String status;
	public float amnt;
	public float dis;
	public float  price;
	
	public void calculateDis()
	{
		amnt = (getPrice() * 15) / 100;
		dis=getPrice()-amnt;
		//System.out.println("Amount after discount " + dis);
	}
	public void display()
	{
		System.out.println("Actual price" +getPrice());
		System.out.println("Discount amount in Offseason "+dis);
		System.out.println("Price after discount "+amnt);
	}
	public static void main(String args[])
	{
		if(status=="Onseason")
		{
			Onseason on=new Onseason();
			on.setPrice(15000f);
			on.calculateDis();
			on.display();
			
		}
		else if(status=="Offseason")
		{
			Offseason of=new Offseason();
			of.setPrice(12000f);
			of.calculateDis();
			of.display();
		}
	}
	
}
