package Array;

public class example6_intArrayDeclarationInitializationInSingleStep 
{
	public static void main(String[] args) 
	{
				
		int [] ar= {30,20,40,10};
		
				
		System.out.println(ar.length);     //4
		System.out.println(ar[1]);      //20
		
		System.out.println("----print all data ----");
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}		
	}
}