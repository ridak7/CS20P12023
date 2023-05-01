package Circle;

public class TestCircle 
{

	public static void main(String[] args) 
	{
		Circle circ = new Circle();
		System.out.println(circ.getRadius());
		circ.setRadius(3.7);
		System.out.println(circ.getRadius());
		System.out.println(circ.area());
		
		Circle circ2 = new Circle(9.2);
		
		System.out.println(circ2.circumference());
		System.out.println(circ2.equals(circ));
		
		System.out.println(circ.toString());
		
		System.out.println(circ2.toString());
		

	}

}

/* Screen Dump
Rectangle has length3.0and width 5.0
Rectangle area: 15.0
Rectangles are NOT equal.

_____________________________________
 
 
 
 */
