package Circle;

public class Circle   //OOP
{
	private double radius;//instance variable
	
	
	public Circle()//Create the constructor method
	{
		radius = 1.2;
	}
	
	public Circle(double r)//Overloading the constructor method
	{
		radius = r;
	}
	
	public double getRadius()//Accessor Method returns radius
	{
		return radius;
	}
	public void setRadius(double r)//Mutator method sets the new radius
	{
		radius = r;
	}

	public double area()//Calculates the area of a circle
	{
		double circleArea = Math.PI * radius * radius;
		
		return circleArea;//returns the area value
	}
	
	public void displayAreaFormula()//Displays the area formula
	{
		System.out.println("The formula for the area of a circle is A = Pi * radius * radius ");
	}
	
	public double circumference()//Calculates the circumference of an area
	{
		double c;
		
		c = 2 * Math.PI * radius;
		
		return c;//returns the value for the circumference
	}
	
	public boolean equals(Object c)
	{
		Circle testObjt = (Circle)c;
		
		if(testObjt.getRadius() == radius)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public String toString()
	{
		String cString;
		
		cString = "Circle has radius " + radius;
		
		return cString;
	}
	
}
