package ClassDemos;

public class RandomNum 
{

	public static void main(String[] args) 
	{
		//Pick two random integers between 1-10
		
		int a = 1 + (int)( 10*Math.random() );
		int b = 1 + (int)( 10*Math.random() );
		
		System.out.println("a: " + a + "\n" + "b: " + b);

	}

}
