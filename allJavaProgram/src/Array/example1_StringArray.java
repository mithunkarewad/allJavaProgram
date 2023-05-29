package Array;

public class example1_StringArray
{
	public static void main(String[] args)
	{
		//step1: array declaration
		String [] ar =new String[5];     //0 to 4     
		
		//step2: array initialization
		ar[0]="Mithun";
		ar[1]="Karewad";
		ar[2]="Akshay";
		ar[3]="suresh";
		ar[4]="ramesh";
		//ar[5]="abcd";
		
		
		System.out.println(ar.length);      //5
		
		//Step3: array usage
		System.out.println(ar[3]);       //suresh
		System.out.println(ar[4]);     //ramesh
		
		System.out.println("---print all info from String array-----");
		
//		for(int i=0; i<=4; i++)       //0 to 4
//		{             
//			System.out.println(ar[i]);
//		}
		
		
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
	}
}