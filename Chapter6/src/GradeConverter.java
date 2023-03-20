import java.util.Scanner;

public class GradeConverter //page 140 SkillBuilder
{
	
	public static boolean isValidNumber(int userNum, int minNum, int maxNum)//signature of isValidNumber
	{
		if(minNum <= userNum && userNum <= maxNum)
		{
			return(true);
		}
		else
		{
			return(false);
		}
	}
	
	public static String getLetterGrade(int numGrade)//signature of getLetterGrade
	{
		if(numGrade < 60)
			return("F");
		else if(numGrade < 70)
		{
			if(numGrade == 69)
				return("D+");
			else
				return("D");
		}
		else if(numGrade < 80)
		{
			if(numGrade == 79)
				return("C+");
			else
				return("C");
		}
		else if(numGrade < 90)
		{
			if(numGrade == 89)
				return("B+");
			else
				return("B");
		}
		else if(numGrade < 100)
		{
			return("A");
		}
		else
		{
			return("A+");
		}
	}
	
		

	public static void main(String[] args)//Signature of main method 
	{
		final int minValue = 0;
		final int maxValue = 100;
		int numericGrade;
		String letterGrade;
		
		Scanner userinput = new Scanner(System.in);
		System.out.print("Enter a numeric grade (-1 to quit): ");
		numericGrade = userinput.nextInt();
		
		
		while(numericGrade != -1)
		{
			if(isValidNumber(numericGrade, minValue, maxValue))//true
			{
				letterGrade = getLetterGrade(numericGrade);
				System.out.println("The grade" + numericGrade + " is a(n) "+ letterGrade +".");
			}
			
			System.out.print("Enter a numeric grade (-1 to quit): ");
			numericGrade = userinput.nextInt();
		}
		
	}

}
