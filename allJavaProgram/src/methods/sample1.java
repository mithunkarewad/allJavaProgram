package methods;

public class sample1
{
	//1: static method call from same class
	
	//main method
	public static void main(String[] args)   //(pre-defined method)
	{		
		System.out.println("Hi");
		
		m1();   //methodname();
		m2();
		m2();
		
		System.out.println("hello");		
	}
	
	//static --> regular method
	public static void m1()    //user defined method
	{
		System.out.println("running static regular method m1");
	}
	
	//static --> regular method
	public static void m2()    
	{
		System.out.println("running static regular method m2");
	}		
}

