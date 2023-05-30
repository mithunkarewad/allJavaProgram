package Constructor;

public class sample6 
{
	//3: example of user defined constructor --> with parameter
	
	//step1: declaration
	int num1;   //10
	int num2;   //20
	
	//step2: initialization
	//user defined constructor --> provided by user
	sample6(int a, int b)
	{
		num1=a;     //10          //assign local variable info into global variable
		num2=b;    //20
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
		
		sample6 s6=new sample6(10,20);
		s6.add();
		s6.mult();
		
		System.out.println("-----");
		
		sample6 s7=new sample6(5, 6);
		s7.add();
		s7.mult();	
		
		System.out.println("-------------------------------");
		
		sample7 s8=new sample7(60, 20);
		s8.sub();
		
		System.out.println("-----");
		
		
		sample7 s9=new sample7(80, 15);
		s9.sub();
	}
}