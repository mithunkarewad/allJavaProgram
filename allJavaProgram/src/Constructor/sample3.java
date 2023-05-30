package Constructor;

public class sample3 
{
	//2: example of user defined constructor --> without/zero parameter
	
	//step1: declaration
	int num1;   //10
	int num2;   //20
	
	//step2: initialization
	//user defined constructor --> provided by user
	//use1: to initialize global variable/ DM
	//use2: to copy/load all the members of class into object
	sample3()
	{
		num1=10;
		num2=20;
	}
	
	//step3: usage
	public void add() 
	{
		System.out.println(num1+num2);
	}
	
	public void mult()
	{
		System.out.println(num1*num2);
	}
	
	public static void main(String[] args)
	{
		sample3 s3=new sample3();
		s3.add();
		s3.mult();
		
		System.out.println("---------------");
				
		sample4 s4=new sample4();
		s4.sub();		
	}
}