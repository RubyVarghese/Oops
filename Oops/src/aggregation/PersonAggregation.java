package aggregation;

public class PersonAggregation {
	private String name;
	private int age;
	private Address1 address;// used as datatype ie,has a representation(entity refference)

	public void setName(String name)
	{
		this.name=name;
	}
	public String getName( )
	{
		return name;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		return age;
	}
	public void setAddress( Address1 address)
	{
		this.address=address;
	}
	public Address1 getAddress()
	{
		return address;
	}
	public static void main(String args[])
	{
		PersonAggregation pa= new PersonAggregation();
		pa.setName("ruby");
		pa.setAge(28);
		
		Address1 ad=new Address1();
		ad.sethousename("Abc villa");
		ad.setstreetname("xyz");
		ad.setpin(6859);
		
		pa.setAddress(ad);
		System.out.println("PersonName is" +pa.getName() );
		System.out.println("Age is " +pa.getAge());
		System.out.println("Address :");
		System.out.println("House Name is "+pa.getAddress().gethousename());
		System.out.println("StreetName is" +pa.getAddress().getstreetname());
		System.out.println("Pincode is " +pa.getAddress().getpin());
	}
}
