package Array;

public class example2_intArray 
{
	public static void main(String[] args)
	{	
		int [] ar1 =new int[4];               //index start from 0 to 3
				
		ar1[0]=30;
		ar1[1]=20;
		ar1[2]=40;
		ar1[3]=10;
		
		
		System.out.println(ar1.length);   //4
		System.out.println(ar1[1]);     //20
		
		System.out.println("----print all info from int array----");
		
//		for(int i=0; i<=3; i++)
//		{
//			System.out.println(ar1[i]);
//		}
		
		
		for(int i=0; i<=ar1.length-1; i++)
		{
			System.out.println(ar1[i]);
		}	
	}
}