package Array;

import java.util.Arrays;

public class example10 
{
	public static void main(String[] args)
	{
		
		int [] 	ar = {50,60,40,10,20};	
		
		Arrays.sort(ar);  // {10, 20, 40, 50, 60}
		
		//System.out.println(ar[0]);
		System.out.println(ar[ar.length-1]);
	}
}