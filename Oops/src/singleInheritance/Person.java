package singleInheritance;

public class Person {
	private String name;
	private String place;
	public void display()
	{
		System.out.println("Name :" +name+ " place :" +place);
	}
	public void setName(String name)
	{
		this.name=name;
		
	}
	public void setPlace(String place)
	{
		this.place=place;
	}
	

}
