package Rectangle;

public class Rectangle 
{
	private double length, width;
	
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

	public double getLength()
	{
		return length;
	}
	
	public double getWidth()
	{
		return width;
	}
	
	public void setLength(double newL)
	{
		length = newL;
	}
	
	public void setWidth(double newW)
	{
		width = newW;
	}
	
	public double area()
	{
		double rectArea;
		
		rectArea = length * width;
		
		return rectArea;
	}
	
	public boolean equals(Object r)
	{
		Rectangle testR = (Rectangle) r;
		
		if(testR.getLength() == length && testR.getWidth() == width)
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
		String rectString;
		
		rectString = "Rectangle has length" + length + 
				"and width " + width;
		
		return rectString;
	}
	
	
}
