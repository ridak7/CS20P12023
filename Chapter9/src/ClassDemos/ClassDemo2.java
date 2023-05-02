package ClassDemos;

public class ClassDemo2 
{

	public static void main(String[] args) 
	{
		int[] indexSquares = new int[5];
		
		//Store squares
		for(int i = 0; i < 5; i++)
		{
			indexSquares[i] = i * i;
		}

		//Display squares
		for(int i = 0; i < 5; i++)
		{
			System.out.println(indexSquares[i]);
		}
	}

}
