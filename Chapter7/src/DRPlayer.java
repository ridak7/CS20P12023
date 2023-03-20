
public class DRPlayer 
{
	private static final int LOW = 0, HIGH = 1;
	private int points;
	private int call;
	private int atRisk;
	private int roll;
	private Die die1 = new Die();
	private Die die2 = new Die();
	
	//Create constructor method
	public DRPlayer()
	{
		points = 1000;
		call = HIGH;
		roll = 2;
	}
	
	public void makeCall(int playerCall)
	{
		call = playerCall;
	}
	
	public void riskPoints(int numPoints)
	{
		atRisk = numPoints;
	}
	
	public void rollDice()
	{
		roll = die1.roll() + die2.roll();
		
		if(roll <= 6)
		{
			if(call == LOW)
			{
				points = points + 2*atRisk;
			}
			else
			{
				points = points - atRisk;
			}
		}
		else if(roll >= 8)
		{

			if(call == HIGH)
			{
				points = points + 2*atRisk;
			}
			else
			{
				points = points - atRisk;
			}
		}
		else if(roll == 7)
		{
			points = points - atRisk;
		}
	}
	
	
	public int showRoll()
	{
		return roll;
	}
	
	
	public int showPoints()
	{
		return points;
	}
	
}
