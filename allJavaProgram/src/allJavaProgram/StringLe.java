package allJavaProgram;

public class StringLe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String org="Welc";
		String rev="";
		for(int i=org.length()-1;i>=0;i--)
		{
			rev=rev+org.charAt(i);
		}
		System.out.println(rev);

	}

}
