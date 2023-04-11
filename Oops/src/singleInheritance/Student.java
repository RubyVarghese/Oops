package singleInheritance;

public class Student extends Person {
	private String course;
	public void setCourse(String course)
	{
		this.course=course;
	}
	public void print()
	{
		display();
		System.out.print("Course:"+course);
	}

}
