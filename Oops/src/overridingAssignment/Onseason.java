package overridingAssignment;

public class Onseason {
	public float amnt;
	public float dis;
	public float price;

	public float getAmnt() {
		return amnt;
	}

	public void setAmnt(float amnt) {
		this.amnt = amnt;
	}

	public float getDis() {
		return dis;
	}

	public void setDis(float dis) {
		this.dis = dis;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public void calculateDis() {
		amnt = (price * 40) / 100;
		dis=price-amnt;
		//System.out.println("Amount after discount " + dis);
	}
	public void display()
	{
		System.out.println("Actual price" +getPrice());
		System.out.println("Discount amount in Onseason "+dis);
		System.out.println("Price after discount "+amnt);
	}
}
