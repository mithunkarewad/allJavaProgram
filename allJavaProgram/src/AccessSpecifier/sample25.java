package AccessSpecifier;

public class sample25 
{
	
	//4: example of public access specifier
	
	public int a;
	
	
	public sample25()
	{
		a=50;
	}
	
	public void m1() 
	{
		System.out.println(a);
	}
	
	public static void main(String[] args)
	{
		sample25 s25=new sample25();
		s25.m1();
		System.out.println(s25.a);
	}
}