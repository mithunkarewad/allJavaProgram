package Array;

import java.util.Arrays;

public class example10_findLowestAndHighestNumberInArray 
{
	public static void main(String[] args)
	{	
		int ar1 []=new int[4];               
				
		ar1[0]=30;    //10
		ar1[1]=20;
		ar1[2]=40;
		ar1[3]=10;     //40
		
		Arrays.sort(ar1);
		 
		//System.out.println(ar1[0]);              //10
		System.out.println(ar1[ar1.length-1]);   //40
	}
}