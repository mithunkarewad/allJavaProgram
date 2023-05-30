package Constructor;

public class Sample8 
{
	//4: mutiple constructor --> constructor overloading
	
	int num1;
	int num2;
	
	
	 Sample8()   
	{
		num1=10;
		num2=20;
	}
	
	 Sample8(int a, int b)
	{
		num1=a;
		num2=b;
	}
	
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
		Sample8  s8=new Sample8();
		s8.add();
		s8.mult();
		
		System.out.println("---------");
		
		Sample8 s9=new Sample8(7, 9);
		s9.add();
		s9.mult();
	}
}