package Rectangle;

public class TestRectangle 
{

	public static void main(String[] args) 
	{
		Rectangle box = new Rectangle(3, 5);
		Rectangle box2 = new Rectangle(4, 5);
		
		System.out.println("Rectangle has length" 
					+ box.getLength() + "and width " + box.getWidth());
		
		System.out.println("Rectangle area: "+
								box.area());
		
		if(box.equals(box2))
		{
			System.out.println("Rectangles are equal.");
		}
		else
		{
			System.out.println("Rectangles are NOT equal.");
		}
	}

}
