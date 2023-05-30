package Constructor;

public class sample1
{
	//1: example of default constructor
	
	//default constructor  --> provided by compiler
	//use: to copy/load all the members of class into object
//	sample1()
//	{
//		
//	}
	
		
	public void m1() 
	{
		System.out.println("running method m1");
	}
	
	
	public static void main(String[] args)
	{
		sample1 s1=new sample1();
		s1.m1();
		
		System.out.println("----------");
		
		sample2 s2=new sample2();
		s2.m2();
	}
}