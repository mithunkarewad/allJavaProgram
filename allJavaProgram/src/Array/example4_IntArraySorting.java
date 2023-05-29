package Array;

import java.util.Arrays;

public class example4_IntArraySorting
{
	public static void main(String[] args) 
	{
		int ar []=new int[4];              
		
		ar[0]=30;      //10
		ar[1]=20;      //20
		ar[2]=40;      //30
		ar[3]=10;      //40
		
		System.out.println("---print original info----");
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
		
		
		Arrays.sort(ar);      //difflassname.methodname(arrayObjectName)
		
		System.out.println("----print Array info in ascending order----");
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
		
		
		System.out.println("----print array info in descending order----");
		for(int i=ar.length-1; i>=0; i--)
		{
			System.out.println(ar[i]);
		}
		
		
	}

}