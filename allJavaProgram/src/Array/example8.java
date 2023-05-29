package Array;

public class example8
{
	public static void main(String[] args)
	{
		// 2*3 multi dementional array
		
		//  0  1  2
		//0 10 20 30
		//1 40 50 60
			
		int [][] ar=new int[2][3];
		
		ar[0][0]=10;
		ar[0][1]=20;
		ar[0][2]=30;
		ar[1][0]=40;
		ar[1][1]=50;
		ar[1][2]=60;
		
				
		System.out.println(ar.length);
		System.out.println(ar[1][2]);
		System.out.println("----print all data---");
		
		
	for(int i=0; i<=1; i++)     //outer for loop --> rows
	{
		for(int j=0; j<=2; j++)    //inner for loop --> cols
		{ //                   1  2
			System.out.print(ar[i][j]+" ");
		}
		System.out.println();
	}
		
	//10 20 30
	//40 50 60
	//
		
		
	}

}