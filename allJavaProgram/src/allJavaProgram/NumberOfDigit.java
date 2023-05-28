package allJavaProgram;

public class NumberOfDigit {

	public static void main(String[] args) {
	int num=4561225;
	int count=0;
	while(num>=0) //num!=0
	{
		num=num/10;
		count++;
	}
	System.out.println("The number of digit are  ="+count);
	}}
