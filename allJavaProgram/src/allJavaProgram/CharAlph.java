package allJavaProgram;

public class CharAlph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch='+';
		if(ch>='a'&ch<='z'|| ch>='A'&ch<='Z')
		{
			System.out.println("This is character  "+ch);
		}
		else if(ch=='@'||ch=='~'||ch=='#'||ch=='%'||ch=='^'||ch=='&')
		{
			System.out.println("This is special symbol "+ch);
		}
		else
		{
			System.out.println("This is not char and special symbol "+ch);
		}

	}

}
