package allJavaProgram;

public class Factorial {

	public static void main(String[] args) {
		int num=3;
		int fact=1;
		for(int i=num;num>=1;num--)
		{
			fact=fact*num;
		}
		System.out.println(fact); 
	}

}
