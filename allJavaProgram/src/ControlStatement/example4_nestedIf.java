package ControlStatement;

public class example4_nestedIf 
{
	public static void main(String[] args)
	{		
		int PEM=400;
		int MEM=850;
		
		//400>=300
		if(PEM>=300)            //outer if
		{
			System.out.println("Eligible for main Exam");
			
			//850>=800
			if(MEM>=800)          //inner or nested if
			{
				System.out.println("Got Selected: MEM>=800");
			}
			else
			{
				System.out.println("Rejected from mains Exam: MEM<800");
			}
		}
		else
		{
			System.out.println("Not Eligible for main Exam: PEM<300");
		}	
	}
}