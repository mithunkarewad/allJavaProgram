package AccessSpecifier;

public class Sample21
{
	//example3: protected access specifier
	
	protected int d;
		
	protected Sample21()
	{
		d=40;
	}
	
	protected void printSquareOfNum() 
	{
		System.out.println(d*d);
	}
	
	public static void main(String[] args) 
	{
		Sample21 s21=new Sample21();
		s21.printSquareOfNum();
		System.out.println(s21.d);	
	}
}