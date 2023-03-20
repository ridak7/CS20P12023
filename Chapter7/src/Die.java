
public class Die 
{
	public static int SIDES = 6;
	
	private int side;
	
	
	//Constructor method
	public Die()
	{
		side = 1;
	}
	
	//The die has been rolled and the side has been returned

	public int roll()
	{
		int sideup;
		
		sideup = (int)(SIDES * Math.random() + 1);
		
		return sideup;
	}
}
