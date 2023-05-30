package Constructor;

public class sample4 
{
	
	int num3;   //50
	int num4;    //30
	
	//user defined constructor--> provided by user
	//use1: to initialize global variable/ DM
	//use2: to copy/load all the members of class into object
	sample4()
	{
		num3=50;
		num4=30;
	}
	
	
	public void sub()
	{
		System.out.println(num3-num4);
	}

}