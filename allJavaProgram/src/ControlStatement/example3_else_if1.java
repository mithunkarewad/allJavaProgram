package ControlStatement;

public class example3_else_if1 
{
	public static void main(String[] args)
	{
		int marks=20;
		
		//62>=65
		if(marks>=65)         //condition1
		{
			System.out.println("Distinction");
		}
		//         62>=60  & 62<=64
		else if (marks>=60 & marks<=64)     //condition2       range --> 60 to 64
		{
			System.out.println("1st class");
		}
		
		else if (marks>=50 & marks<=59)    //condition 3  range --> 50 to 59
		{
			System.out.println("2nd class");
		}
		
		else if (marks>=35  & marks<=49)       //condtion 4     range  35 to 49
		{
			System.out.println("Pass");
		}
		
		else if (marks<35) 
		{
			System.out.println("Fail");
		}
		
	}

}