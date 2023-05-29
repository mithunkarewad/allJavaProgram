package Array;

public class example3_printArrayInReverseOrder
{
	public static void main(String[] args)
	{	
		int ar []=new int[4];              
				
		ar[0]=30;
		ar[1]=20;
		ar[2]=40;
		ar[3]=10;
		
		
		System.out.println("---print original info---");
		
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
		
		
		System.out.println("---print array in reverse order---");
		
	for(int i=ar.length-1;i>=0;i--)
	{
		System.out.println(ar[i]);
	}
		
		//10
		//40
		//20
		//30

	}
}