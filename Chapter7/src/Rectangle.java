
public class Rectangle 
{
	private double length, width;
	
	//Constructor
	public Rectangle()
	{
		length = 1;
		width = 1;
	}
	
	public Rectangle(double l, double w)
	{
		length = l;
		width = w;
	}

	public double getWidth()
	{
		return width;
	}
	
	
	
	public boolean equals(Object r)
	{
		Rectangle testObjt = (Rectangle)r;
		
		if(testObjt.getWidth() == width && testObjt.getLength() == length)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
