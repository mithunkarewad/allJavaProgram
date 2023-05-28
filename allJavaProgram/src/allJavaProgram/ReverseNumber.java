package allJavaProgram;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1245;
		int rev=0;
		int lastdigit;
while(num!=0)
{
	lastdigit=num%10;
	rev=rev*10+lastdigit;
	num=num/10;
	}
System.out.println("The reverse number is "+rev);
	}

}
